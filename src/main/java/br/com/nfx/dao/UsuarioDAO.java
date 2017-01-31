/*
	 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nfx.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.nfx.model.Empresa;
import br.com.nfx.model.Usuario;
import br.com.nfx.util.UtilNfx;


/**
 *
 * @author Leonardo
 */

@Repository
@Transactional
public class UsuarioDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	public void saveUsuario(Usuario usuario) {
		try {
			usuario.setSenha(UtilNfx.cript(usuario.getSenha()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		entityManager.merge(usuario);
	}

	public void deleteUsuario(Usuario usuario) {
		try{
			entityManager.remove(entityManager.getReference(Usuario.class, usuario.getCodusuario()));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateUsuario(Usuario usuario) {
		entityManager.merge(usuario);
	}

	public Usuario getUsuarioById(Long id) {
		Usuario usuarios = (Usuario) entityManager.find(Usuario.class, id);

		return usuarios;

	}

	public List<Usuario> getUsuario() {
		List list = entityManager.createQuery("from Usuario").getResultList();
		return list;
	}

	@SuppressWarnings("finally")
	public Usuario getUsuarioLogin(String user, String senha) {

		Usuario usuarios = null;
		try {
			
			Query q = entityManager.createQuery("from Usuario where login = :login and senha = :senha");
			
			usuarios = (Usuario) q.setParameter("login", user.toUpperCase()).setParameter("senha", senha).getSingleResult();
			 
//			usuarios = (Usuario) getSessionFactory().getCurrentSession().createCriteria(Usuario.class)
//					.add(Restrictions.eq("login", user.toUpperCase())).add(Restrictions.eq("senha", senha))
//					.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error in login() --> " + e.getMessage());
		} finally {
			return usuarios;
		}
	}
	
}
