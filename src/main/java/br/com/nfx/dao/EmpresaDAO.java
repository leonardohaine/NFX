/*
	 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nfx.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.nfx.model.Empresa;


/**
 *
 * @author Leonardo
 */

@Repository
@Transactional
public class EmpresaDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	private void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void salvar(Empresa empresa) {
		
		getSessionFactory().getCurrentSession().merge(empresa);
	}

	public void deletar(Empresa empresa) {
		getSessionFactory().getCurrentSession().delete(empresa);
	}

	public void atualizar(Empresa empresa) {
		getSessionFactory().getCurrentSession().update(empresa);
	}

	public Empresa getEmpresaById(Long id) {
		Empresa empresa = (Empresa) getSessionFactory().getCurrentSession().get(Empresa.class, id);

		return empresa;

	}

	public List<Empresa> getEmpresa() {
		List list = getSessionFactory().getCurrentSession().createQuery("from Empresa").list();
		return list;
	}
	
	public List<String> getCidade(String uf){
		List list = getSessionFactory().getCurrentSession().createSQLQuery("select descricao_municipio from cidade where sigla_uf = '" + uf + "'").list();
		return list;
	}


}
