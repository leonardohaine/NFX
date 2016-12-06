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

import br.com.nfx.model.Usuario;
import br.com.nfx.service.UsuarioService;

/**
 *
 * @author Leonardo
 */
@ManagedBean(name = "usuario")
@ViewScoped
public class UsuarioController {

	private Usuario usuario = new Usuario();
	private List<Usuario> listUsuario;
	private Usuario selectedUsuario = new Usuario();

	@ManagedProperty(value = "#{UsuarioService}")
	private UsuarioService usuarioService;

	public UsuarioController() {

	}

	/**
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario
	 *            the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the listUsuario
	 */
	public List<Usuario> getListUsuario() {
		listUsuario = new ArrayList<Usuario>();
		listUsuario = getUsuarioService().getUsuario();
		return listUsuario;
	}

	/**
	 * @param listUsuario
	 *            the listUsuario to set
	 */
	public void setListUsuario(List<Usuario> listUsuario) {
		this.listUsuario = listUsuario;
	}

	public String save() {
		try {
			getUsuarioService().saveUsuario(usuario);

			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
					"Sucesso!", "Usuário cadastrado"));
			return "listaUsuario";
		} catch (Exception e) {
			e.printStackTrace();
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"Erro!", "Erro ao tentar cadastrar usuário: " +e));
			return null;
		}
	}
	
	@PostConstruct
	public void editar(){
		String id = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("usuarioId");
		if(id != null){
			System.out.println("ID editar: " + id);
			usuario = getUsuarioService().getUsuarioById(Long.valueOf(id));
		}
	}
	
	public String delete() {

		try {
			getUsuarioService().deleteUsuario(selectedUsuario);
			
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
					"Sucesso!", "Usuário deletado: " + selectedUsuario.getLogin()));
			return "listaUsuario";
		} catch (Exception e) {

			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"Erro!", "Erro ao deletar usuário: " +e));
			return null;
		}
	}

	public void selectUsuario(SelectEvent event) {
		// listCorretores = new ClienteDAO().listaClientes();

		if (event.getObject() != null) {
			Usuario usuario = (Usuario) event.getObject();
			setUsuario(getUsuarioService().getUsuarioById(usuario.getCodusuario().longValue()));

		}
	}

	/**
	 * @return the selectedUsuario
	 */
	public Usuario getSelectedUsuario() {
		return selectedUsuario;
	}

	/**
	 * @param selectedUsuario
	 *            the selectedUsuario to set
	 */
	public void setSelectedUsuario(Usuario selectedUsuario) {
		this.selectedUsuario = selectedUsuario;
	}

	/**
	 * @return the usuarioService
	 */
	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	/**
	 * @param usuarioService
	 *            the usuarioService to set
	 */
	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
}
