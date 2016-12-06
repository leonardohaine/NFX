/*
	 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nfx.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.nfx.model.Usuario;
import br.com.nfx.util.Util;


/**
 *
 * @author Leonardo
 */

@Repository
@Transactional
public class UsuarioDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	private void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void saveUsuario(Usuario usuario) {
		try {
			usuario.setSenha(Util.cript(usuario.getSenha()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getSessionFactory().getCurrentSession().merge(usuario);
	}

	public void deleteUsuario(Usuario usuario) {
		try{
			getSessionFactory().getCurrentSession().delete(usuario);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateUsuario(Usuario usuario) {
		getSessionFactory().getCurrentSession().update(usuario);
	}

	public Usuario getUsuarioById(Long id) {
		Usuario usuarios = (Usuario) getSessionFactory().getCurrentSession().get(Usuario.class, id);

		return usuarios;

	}

	public List<Usuario> getUsuario() {
		List list = getSessionFactory().getCurrentSession().createQuery("from Usuario").list();
		return list;
	}

	public Usuario getUsuario(String user, String senha) {

		Usuario usuarios = null;
		boolean retorno = false;
		try {
			usuarios = (Usuario) getSessionFactory().getCurrentSession().createCriteria(Usuario.class)
					.add(Restrictions.eq("login", user.toUpperCase())).add(Restrictions.eq("senha", senha))
					.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error in login() --> " + e.getMessage());
		} finally {
			return usuarios;
		}
	}

}
