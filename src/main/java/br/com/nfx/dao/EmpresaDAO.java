/*
	 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nfx.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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

	@PersistenceContext
	private EntityManager entityManager;
	
	public void salvar(Empresa empresa) {
		entityManager.merge(empresa);
	}

	public void deletar(Empresa empresa) {
		entityManager.remove(entityManager.getReference(Empresa.class, empresa.getIdEmpresa()));
	}

	public void atualizar(Empresa empresa) {
		entityManager.merge(empresa);
	}

	public Empresa getEmpresaById(Long id) {
		Empresa empresa = (Empresa) entityManager.find(Empresa.class, id);
		return empresa;
	}
	
	public Empresa getEmpresaByCnpj(String cnpj) {
		try{
			Query query =  entityManager.createNativeQuery("select * from empresa where cnpj = :cnpj", Empresa.class)
					.setParameter("cnpj", cnpj);
			Empresa empresa = (Empresa) query.getSingleResult();
			return (Empresa)empresa;
		}catch (NoResultException e) {
			return null;
		}
	}

//	public List<Empresa> getEmpresa() {
//		List list = getSessionFactory().getCurrentSession().createQuery("from Empresa").list();
//		return list;
//	}
	
	public List<String> getCidade(String uf){
		
		Query query = entityManager.createNativeQuery("select descricao_municipio from cidade where sigla_uf = :sigla_uf");
		query.setParameter("sigla_uf", uf);
		return query.getResultList();
	}


}
