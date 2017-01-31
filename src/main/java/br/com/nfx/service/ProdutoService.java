package br.com.nfx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.nfx.dao.ProdutoDAO;
import br.com.nfx.model.Produto;



@Service("ProdutoService")
@Transactional(readOnly = true)
public class ProdutoService {

	
	@Autowired
	ProdutoDAO produtoDAO;

	@Transactional(readOnly = false)
	public void salvar(Produto produto) {
		getProdutoDAO().salvar(produto);
	}

	@Transactional(readOnly = false)
	public void deleteProduto(Produto produto) {
		getProdutoDAO().deletar(produto);
	}

	@Transactional(readOnly = false)
	public void updateProduto(Produto produto) {
		getProdutoDAO().atualizar(produto);
	}

	public Produto getProdutoById(Long id) {
		return getProdutoDAO().getProdutoById(id);
	}


	public ProdutoDAO getProdutoDAO() {
		return produtoDAO;
	}


	public void setProdutoDAO(ProdutoDAO produtoDAO) {
		this.produtoDAO = produtoDAO;
	}

	public List<Produto> getProduto() {
		return getProdutoDAO().getProduto();
	}
	
	

	
	
	
}
