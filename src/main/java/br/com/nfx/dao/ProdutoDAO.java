package br.com.nfx.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.nfx.model.Empresa;
import br.com.nfx.model.Produto;

@Repository
@Transactional
public class ProdutoDAO {
	
	@PersistenceContext
	private EntityManager entityManager;	
	
	public void salvar(Produto produto) {
		
		entityManager.merge(produto);
	}

	public void deletar(Produto produto) {
		entityManager.remove(produto);
	}

	public void atualizar(Produto produto) {
		entityManager.merge(produto);
	}

	public Produto getProdutoById(Long id) {
		Produto produto = (Produto) entityManager.find(Produto.class,  id);
		

		return produto;

	}

	public List<Produto> getProduto() {
		List list = entityManager.createQuery("from Produto order by id").getResultList();
		
		return list;
	}
	


}
