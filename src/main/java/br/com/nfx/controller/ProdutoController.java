package br.com.nfx.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.nfx.model.Produto;
import br.com.nfx.model.Usuario;
import br.com.nfx.service.ProdutoService;

@ManagedBean(name = "produtoBean")
@ViewScoped
public class ProdutoController {


//	@Autowired
//	private Produto produto;
	
	
	private Produto produto = new Produto();
	private List<Produto> listaProduto;
	
	
	
	
	
	@ManagedProperty(value = "#{ProdutoService}")
//	private ProdutoService produtoService;
	
private ProdutoService produtoService = new ProdutoService();
	
	public ProdutoController(){
		
	}

	
	public String salvar(){

		
		try {
			getProdutoService().salvar(produto);

			
			produto = new Produto();
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Sucesso!"," Cliente cadastrado"));
			
			return "listaProduto";
			
		} catch (Exception e) {
			e.printStackTrace();
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Erro", "Ocorreu um erro ao tentar cadastrar o produto"));

			return "produto";
		}
	
	}
		
		public void editar(){
//			FacesContext.getCurrentInstance().getExternalContext().getFlash().put("selectedProduto", selectedProduto);
			
			setProduto((Produto)FacesContext.getCurrentInstance().getExternalContext().getFlash().get("selectedProduto"));
			
			String id = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("produtoId");
			System.out.println("ID editar: " + id);
			if(id != null){
				System.out.println("ID editar: " + id);
				produto = getProdutoService().getProdutoById(Long.valueOf(id));
			}
			
		}
		
		
		
		
		public String deletar(){
			
			try {
				
				getProdutoService().deleteProduto(produto);
				produto = new Produto();
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
						"Sucesso!", "Cliente deletado: " ));
				return "listaProduto";
				
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			
			return null;
		}

		
		
		

	
	
	
	
	
	
	

	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	public List<Produto> getListaProduto() {
		listaProduto = new  ArrayList<Produto>();
		listaProduto = getProdutoService().getProduto();
		
		return listaProduto;
	}


	public void setListaProduto(List<Produto> listaProduto) {
		this.listaProduto = listaProduto;
		
	}


	public ProdutoService getProdutoService() {
		return produtoService;
	}


	public void setProdutoService(ProdutoService produtoService) {
		this.produtoService = produtoService;
	}
	
	
	
	
	
}
