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

import org.primefaces.event.SelectEvent;

import br.com.nfx.model.Empresa;
import br.com.nfx.service.EmpresaService;

/**
 *
 * @author Leonardo
 */
@ManagedBean(name = "empresa")
@ViewScoped
public class EmpresaController {

	private Empresa empresa = new Empresa();
	private List<Empresa> listEmpresa;
	private Empresa selectedEmpresa = new Empresa();

	@ManagedProperty(value = "#{EmpresaService}")
	private EmpresaService empresaService;

	public EmpresaController() {

	}

	/**
	 * @return the empresa
	 */
	public Empresa getEmpresa() {
		return empresa;
	}

	/**
	 * @param empresa
	 *            the empresa to set
	 */
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	/**
	 * @return the listEmpresa
	 */
	public List<Empresa> getListEmpresa() {
		listEmpresa = new ArrayList<Empresa>();
		listEmpresa = getEmpresaService().getEmpresa();
		return listEmpresa;
	}

	/**
	 * @param listEmpresa
	 *            the listEmpresa to set
	 */
	public void setListEmpresa(List<Empresa> listEmpresa) {
		this.listEmpresa = listEmpresa;
	}

	public String save() {
		try {
			getEmpresaService().getEmpresaDAO().saveEmpresa(empresa);

			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
					"Sucesso!", "Empresa cadastrado"));
			return "listaEmpresa";
		} catch (Exception e) {
			e.printStackTrace();
			empresa = new Empresa();
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"Erro!", "Erro ao tentar cadastrar empresa: " +e));
			return null;
		}
	}
	
	@PostConstruct
	public void editar(){
		String id = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("empresaId");
		if(id != null){
			System.out.println("ID editar: " + id);
			empresa = getEmpresaService().getEmpresaById(Long.valueOf(id));
		}
	}
	
	public String delete() {

		try {
			getEmpresaService().getEmpresaDAO().deleteEmpresa(selectedEmpresa);
			
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
					"Sucesso!", "Empresa deletada: " + selectedEmpresa.getEmpresa()));
			return "listaEmpresa";
		} catch (Exception e) {

			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"Erro!", "Erro ao deletar empresa: " +e));
			return null;
		}
	}
	
	public void onEmpUnidade(SelectEvent event) {
		Empresa emp = (Empresa) event.getObject();
        
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Car Selected", "Id:" + emp.getCnpj());
        FacesContext.getCurrentInstance().addMessage(null, message);
        
        setEmpresa(getEmpresaService().getEmpresaDAO().getEmpresaById(emp.getEmpresa()));
        setSelectedEmpresa(getEmpresaService().getEmpresaDAO().getEmpresaById(emp.getEmpresa()));
    }
	
	public void selectHospFromDialog(Empresa emp) {
		System.out.println("selectEmpFromDialog: " + emp);
		setEmpresa(getEmpresaService().getEmpresaDAO().getEmpresaById(emp.getEmpresa()));
        setSelectedEmpresa(getEmpresaService().getEmpresaDAO().getEmpresaById(emp.getEmpresa()));
    }
	
	public void selectEmpresa(SelectEvent event) {
		// listCorretores = new ClienteDAO().listaClientes();
		System.out.println(event.toString());
		if (event.getObject() != null) {
			Empresa empresa = (Empresa) event.getObject();
			setEmpresa(getEmpresaService().getEmpresaDAO().getEmpresaById(empresa.getEmpresa()));

		}
	}

	/**
	 * @return the selectedEmpresa
	 */
	public Empresa getSelectedEmpresa() {
		return selectedEmpresa;
	}

	/**
	 * @param selectedEmpresa
	 *            the selectedEmpresa to set
	 */
	public void setSelectedEmpresa(Empresa selectedEmpresa) {
		this.selectedEmpresa = selectedEmpresa;
	}

	/**
	 * @return the empresaService
	 */
	public EmpresaService getEmpresaService() {
		return empresaService;
	}

	/**
	 * @param empresaService
	 *            the empresaService to set
	 */
	public void setEmpresaService(EmpresaService empresaService) {
		this.empresaService = empresaService;
	}
}
