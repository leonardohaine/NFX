/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nfx.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;

import br.com.nfx.model.Cliente;
import br.com.nfx.service.ClienteService;

/**
 *
 * @author Leonardo
 */
@ManagedBean(name = "cliente")
@ViewScoped
public class ClienteController {

	private Cliente cliente = new Cliente();
	private List<Cliente> listCliente;
	private List<String> listCidade = new ArrayList<String>();
	private Cliente selectedCliente = new Cliente();

	@ManagedProperty(value = "#{ClienteService}")
	private ClienteService clienteService;

	public ClienteController() {

	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente
	 *            the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the listCliente
	 */
	public List<Cliente> getListCliente() {
		listCliente = new ArrayList<Cliente>();
		listCliente = getClienteService().getCliente();
		return listCliente;
	}

	/**
	 * @param listCliente
	 *            the listCliente to set
	 */
	public void setListCliente(List<Cliente> listCliente) {
		this.listCliente = listCliente;
	}

	public String save() {
		try {
			getClienteService().getClienteDAO().saveCliente(cliente);

			cliente = new Cliente();
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
					"Sucesso!", "Cliente cadastrado"));
			return "cliente";
		} catch (Exception e) {
			e.printStackTrace();
			cliente = new Cliente();
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"Erro!", "Erro ao tentar cadastrar cliente: " +e));
			return "cliente";
		}
	}
	
	@PostConstruct
	public String Edit(){
		FacesContext.getCurrentInstance().getExternalContext().getFlash().put("selectedCliente", selectedCliente);
		
		setCliente((Cliente)FacesContext.getCurrentInstance().getExternalContext().getFlash().get("selectedCliente"));
		
		return "cliente";
	}
	
	public String delete() {

		try {
			getClienteService().getClienteDAO().deleteCliente(cliente);
			cliente = new Cliente();
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
					"Sucesso!", "Usuário deletado: " + selectedCliente.getRazaoSocial()));
			return "usuarios";
		} catch (Exception e) {

			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"Erro!", "Erro ao deletar usuário: " +e));
			return "usuario";
		}
	}

	public void selectCliente(SelectEvent event) {
		// listCorretores = new ClienteDAO().listaClientes();

		if (event.getObject() != null) {
			Cliente cliente = (Cliente) event.getObject();
			setCliente(getClienteService().getClienteDAO().getClienteById(cliente.getClienteId()));

		}
	}
	
	public void selectionChanged(){
		System.out.println("getCidade: " + cliente.getUf());
		listCidade = getClienteService().getClienteDAO().getCidades(cliente.getUf());
		RequestContext.getCurrentInstance().update("formUsu:municipio");
	}

	/**
	 * @return the selectedCliente
	 */
	public Cliente getSelectedCliente() {
		return selectedCliente;
	}

	/**
	 * @param selectedCliente
	 *            the selectedCliente to set
	 */
	public void setSelectedCliente(Cliente selectedCliente) {
		this.selectedCliente = selectedCliente;
	}

	/**
	 * @return the clienteService
	 */
	public ClienteService getClienteService() {
		return clienteService;
	}

	/**
	 * @param clienteService
	 *            the clienteService to set
	 */
	public void setClienteService(ClienteService clienteService) {
		this.clienteService = clienteService;
	}

	public List<String> getListCidade() {
		return listCidade;
	}

	public void setListCidade(List<String> listCidade) {
		this.listCidade = listCidade;
	}
}
