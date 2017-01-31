/*
	 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nfx.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
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

	@PersistenceContext
	private EntityManager entityManager;
	
	
	public void salvar(Cliente cliente) {
		
		entityManager.merge(cliente);
	}

	public void deleteCliente(Cliente cliente) {
		entityManager.remove(entityManager.getReference(Cliente.class, cliente.getClienteId()));
	}

	public void updateCliente(Cliente cliente) {
		entityManager.merge(cliente);
	}

	public Cliente getClienteById(Long id) {
		Cliente cliente = (Cliente) entityManager.find(Cliente.class, id);

		return cliente;

	}

	public List<Cliente> getCliente() {
		List list = entityManager.createQuery("from Cliente order by cliente_id").getResultList();
		return list;
	}

	public List<String> getCidade(String uf){
		Query query = entityManager.createNativeQuery("select descricao_municipio from cidade where sigla_uf = :sigla_uf");
		query.setParameter("sigla_uf", uf);
		return query.getResultList();
	}
	
	public Cliente getClienteByRazaoSocial(String razaoSocial) {
		
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Cliente> query = builder.createQuery(Cliente.class);
		Root<Cliente> from = query.from(Cliente.class);
		TypedQuery<Cliente> typedQuery = entityManager.createQuery(
		    query.select(from )
		    .where(
		       builder.equal(from.get("razao_social"), razaoSocial)
		    )
		);
		
		Cliente cliente = typedQuery.getSingleResult();

		return cliente;
	}
	
	public Cliente getClienteByCnpj(String cnpj) {
		
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Cliente> query = builder.createQuery(Cliente.class);
		Root<Cliente> from = query.from(Cliente.class);
		TypedQuery<Cliente> typedQuery = entityManager.createQuery(
		    query.select(from )
		    .where(
		       builder.equal(from.get("cnpj"), cnpj)
		    )
		);
		
		Cliente cliente = typedQuery.getSingleResult();
		
//		Cliente cliente = (Cliente) getSessionFactory().getCurrentSession().createCriteria(Cliente.class)
//				.add(Restrictions.eq("cnpj", cnpj)).uniqueResult();

		return cliente;
	}

}
