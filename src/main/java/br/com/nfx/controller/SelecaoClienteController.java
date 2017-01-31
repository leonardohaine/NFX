package br.com.nfx.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;

import org.primefaces.context.RequestContext;

import br.com.nfx.model.Cliente;
import br.com.nfx.service.ClienteService;
	

@ViewScoped
@ManagedBean(name = "selecaoClienteBean")
public class SelecaoClienteController implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManagedProperty(value = "#{ClienteService}")
	private ClienteService clienteService;
	
	private String razaoSocial;
	private String cnpj;
	
	private List<Cliente> clientesFiltrados = new ArrayList<Cliente>();
	private Cliente selectedCliente;
	public SelecaoClienteController(){
		
	}
	
	public void pesquisar() {
		clientesFiltrados = (List<Cliente>) getClienteService().getClienteByRazaoSocial(razaoSocial);
	}
	
	public void pesquisarCnpj() {
		clientesFiltrados = (List<Cliente>) getClienteService().getClienteByRazaoSocial(razaoSocial);
	}
	
	public void abrirDialogo() {
		Map<String, Object> opcoes = new HashMap<>();
		opcoes.put("modal", true);
		opcoes.put("resizable", false);
		opcoes.put("contentHeight", 300);
		opcoes.put("appendToBody", true);
		opcoes.put("header", "Seleção de cliente da Nota Fiscal");
		System.out.println("abrindo dialogo clientes");
		RequestContext.getCurrentInstance().openDialog("selecaoCliente", opcoes, null);
	}
	
	
	public void selecionar(Cliente cliente) {
		
		RequestContext.getCurrentInstance().closeDialog(cliente);
		System.out.println("fechando dialogo cliente: " + cliente);
	}
	
	public ClienteService getClienteService() {
		return clienteService;
	}

	public void setClienteService(ClienteService clienteService) {
		this.clienteService = clienteService;
	}

	public Cliente getSelectedCliente() {
		System.out.println("getSelectedCliente; " + selectedCliente);
		return selectedCliente;
	}

	public void setSelectedCliente(Cliente selectedCliente) {
		System.out.println("setSelectedCliente; " + selectedCliente);
		this.selectedCliente = selectedCliente;
	}

	public List<Cliente> getClientesFiltrados() {
		return clientesFiltrados;
	}

	public void setClientesFiltrados(List<Cliente> clientesFiltrados) {
		this.clientesFiltrados = clientesFiltrados;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}

