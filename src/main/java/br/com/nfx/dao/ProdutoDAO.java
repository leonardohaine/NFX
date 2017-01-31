package br.com.nfx.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.nfx.model.Empresa;
import br.com.nfx.model.Produto;

@Repository
@Transactional
public class ProdutoDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	public void salvar(Produto produto) {
		
		getSessionFactory().getCurrentSession().merge(produto);
	}

	public void deletar(Produto produto) {
		getSessionFactory().getCurrentSession().delete(produto);
	}

	public void atualizar(Produto produto) {
		getSessionFactory().getCurrentSession().update(produto);
	}

	public Produto getProdutoById(Long id) {
		Produto produto = (Produto ) getSessionFactory().getCurrentSession().get(Produto.class, id);

		return produto;

	}

	public List<Produto> getProduto() {
		List list = getSessionFactory().getCurrentSession().createQuery("from Produto").list();
		return list;
	}
	


}
