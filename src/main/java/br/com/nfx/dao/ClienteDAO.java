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

import br.com.nfx.model.Cliente;


/**
 *
 * @author Leonardo
 */

@Repository
@Transactional
public class ClienteDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	private void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void saveCliente(Cliente cliente) {
		
		getSessionFactory().getCurrentSession().saveOrUpdate(cliente);
	}

	public void deleteCliente(Cliente cliente) {
		getSessionFactory().getCurrentSession().delete(cliente);
	}

	public void updateCliente(Cliente cliente) {
		getSessionFactory().getCurrentSession().update(cliente);
	}

	public Cliente getClienteById(Long id) {
		Cliente cliente = (Cliente) getSessionFactory().getCurrentSession().get(Cliente.class, id);

		return cliente;

	}

	public List<Cliente> getCliente() {
		List list = getSessionFactory().getCurrentSession().createQuery("from Cliente").list();
		return list;
	}

	public Cliente getCliente(String user, String senha) {

		Cliente cliente = null;
		boolean retorno = false;
		try {
			cliente = (Cliente) getSessionFactory().getCurrentSession().createCriteria(Cliente.class)
					.add(Restrictions.eq("login", user.toUpperCase())).add(Restrictions.eq("senha", senha))
					.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error in login() --> " + e.getMessage());
		} finally {
			return cliente;
		}
	}
	
	public List<String> getCidades(String uf){
		List list = getSessionFactory().getCurrentSession().createSQLQuery("select descricao_municipio from cidade where sigla_uf = '" + uf + "'").list();
		return list;
	}

}
