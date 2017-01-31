/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nfx.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.primefaces.event.SelectEvent;

import br.com.nfx.model.Empresa;
import br.com.nfx.service.EmpresaService;
import br.com.nfx.util.UtilNfx;

/**
 *
 * @author Leonardo
 */
@ManagedBean(name = "unidade")
@SessionScoped
public class UnidadeController {

	private Empresa empresa = new Empresa();
	private List<Empresa> listEmpresa;
	private Empresa selectedEmpresa = new Empresa();

	@ManagedProperty(value = "#{EmpresaService}")
	private EmpresaService empresaService;

	public UnidadeController() {
		
	}

	@PostConstruct
	public void loadCookie(){
		Map<String, Object> requestCookieMap = FacesContext.getCurrentInstance()
				   .getExternalContext()
				   .getRequestCookieMap();
		
		Cookie cookie = (Cookie) requestCookieMap.get("selectEmpresaNfx");
		String cnpj = cookie != null ? cookie.getValue().replaceAll("[^0-9]", "") :  "";
		if(cnpj != null){
			System.out.println(cnpj);
			
			System.out.println("UnidadeController: " + getEmpresaService());
			setEmpresa(getEmpresaService().getEmpresaByCnpj(cnpj));
	     
	     
			HttpSession session = UtilNfx.getSession();
			FacesContext.getCurrentInstance().getExternalContext().setResponseContentType("multipart/form-data");
			session.setAttribute("cnpjUnidade", cnpj);
		}
	}
	
	public void loadListEmpresa(){
		listEmpresa = getEmpresaService().getEmpresa();
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
			getEmpresaService().salvar(empresa);

			empresa = new Empresa();
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
					"Sucesso!", "Usuário cadastrado"));
			return "empresa";
		} catch (Exception e) {
			e.printStackTrace();
			empresa = new Empresa();
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"Erro!", "Erro ao tentar cadastrar usuário: " +e));
			return "empresa";
		}
	}
	
	
	public String Edit(){
		FacesContext.getCurrentInstance().getExternalContext().getFlash().put("selectedEmpresa", selectedEmpresa);
		
		setEmpresa((Empresa)FacesContext.getCurrentInstance().getExternalContext().getFlash().get("selectedEmpresa"));
		System.out.println("selectedEmpresa: " + selectedEmpresa);
		System.out.println("empresa: " + empresa);
		
		return "empresa";
	}
	
	public String delete() {

		try {
			getEmpresaService().deletar(empresa);
			empresa = new Empresa();
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
					"Sucesso!", "Usuário deletado: " + selectedEmpresa.getIdEmpresa()));
			return "empresas";
		} catch (Exception e) {

			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"Erro!", "Erro ao deletar usuário: " +e));
			return "empresa";
		}
	}
	
//	public void onEmpUnidade(SelectEvent event) {
//		Empresa emp = (Empresa) event.getObject();
//        
//		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Car Selected", "Id:" + emp.getCnpj());
//        FacesContext.getCurrentInstance().addMessage(null, message);
//        
//        setEmpresa(getEmpresaService().getEmpresaDAO().getEmpresaById(emp.getIdEmpresa()));
//        setSelectedEmpresa(getEmpresaService().getEmpresaDAO().getEmpresaById(emp.getIdEmpresa()));
//    }
	
	public void selectEmpFromDialog(Empresa emp) {
		System.out.println("selectEmpFromDialog: " + emp);
		setEmpresa(getEmpresaService().getEmpresaById(emp.getIdEmpresa()));
        //setSelectedEmpresa(getEmpresaService().getEmpresaById(emp.getIdEmpresa()));
        
        HttpSession session = UtilNfx.getSession();
		FacesContext.getCurrentInstance().getExternalContext().setResponseContentType("multipart/form-data");
		session.setAttribute("cnpjUnidade", emp.getCnpj());
		
		Map<String, Object> properties = new HashMap<>();
		properties.put("path", "/NFX");
		properties.put("maxAge", 3600 * 24 * 700);
		properties.put("secure", ((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest()).isSecure());
		
		FacesContext.getCurrentInstance()
		 .getExternalContext()
		 .addResponseCookie("selectEmpresaNfx", emp.getCnpj().replaceAll("[^0-9]", ""), properties);
		
//		String cnpjCookie = (String) FacesContext.getCurrentInstance()
//				   .getExternalContext()
//				   .getRequestCookieMap().get("selectEmpresaNfx");
		
    }
	
	public void selectEmpresa(SelectEvent event) {
		// listCorretores = new ClienteDAO().listaClientes();
		System.out.println(event.toString());
		if (event.getObject() != null) {
			Empresa empresa = (Empresa) event.getObject();
			setEmpresa(getEmpresaService().getEmpresaDAO().getEmpresaById(empresa.getIdEmpresa()));

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
