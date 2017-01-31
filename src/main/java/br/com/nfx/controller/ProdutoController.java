package br.com.nfx.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

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
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Sucesso!"," produto cadastrado"));
			
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
		
		
		
		
		public String deletar(ActionEvent evento){
			
 produto =  (Produto) evento.getComponent().getAttributes().get("prodSelec");
 
 
 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
			"Sucesso!", "Produto deletado: " ));
 
	return "listaProduto" ;
			
			
			//			try {
//				
//				getProdutoService().deleteProduto(produto);
//				produto = new Produto();
//				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
//						"Sucesso!", "Produto deletado: " ));
//				return "listaProduto";
//				
//				
//				
//			} catch (Exception e) {
//
//				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
//						"Erro!", "Erro ao deletar produto: " +e));
//				return "produto";
			
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
