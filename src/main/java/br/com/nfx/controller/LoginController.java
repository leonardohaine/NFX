/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nfx.controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.primefaces.context.RequestContext;

import br.com.nfx.model.Usuario;
import br.com.nfx.service.UsuarioService;
import br.com.nfx.util.Util;

/**
 *
 * @author Leonardo
 */
@ManagedBean(name = "auth")
@SessionScoped
public class LoginController implements Serializable {

	private Usuario usuario = new Usuario();
	// LoginController auth = new LoginController();
	private List<Usuario> listUsers;
	private String user;
	private String senha;
	private Boolean checkSafx04;
	private Boolean checkUsuarios;
	private Boolean checkSafx0708;
	private Boolean checkconfig;
	private Boolean checkSafx2013;
	private Boolean checkpesquisa;
	private Boolean isadmin;
	private Boolean isativo;

	private Boolean loggedIn;

	@ManagedProperty(value = "#{UsuarioService}")
	private UsuarioService usuarioService;

	public LoginController() {
		// auth = new LoginController();
		System.out.println("@PostConstruct");
		RequestContext.getCurrentInstance().openDialog("dlg");
	}

	/**
	 * @return the usuario
	 */
	// @PostConstruct
	public Usuario getUsuario() {

		return usuario;
	}

	/**
	 * @param usuario
	 *            the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		if (usuario == null) {
			usuario = new Usuario();
		}
		this.usuario = usuario;
	}

	public void setListUsers(List<Usuario> lista) {
		listUsers = lista;
	}

	public List<Usuario> getListUsers() {
		listUsers = getUsuarioService().getUsuarioDAO().getUsuario();

		for (Usuario user : listUsers) {
			System.out.println("Controller listUsuario: " + user.getNome());
		}
		return listUsers;
	}

	public String login() {
		RequestContext context = RequestContext.getCurrentInstance();
		FacesMessage msg = null;
		boolean loggedIn = false;

		Usuario usu = null;
		try {
			usu = getUsuarioService().getUsuarioDAO().getUsuario(user, Util.cript(senha));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (usu != null) {

			setCheckUsuarios(usu.getCheckusuarios());
			isadmin = usu.getIsadmin();
			isativo = usu.getAtivo();
			

			loggedIn = true;
		} else {
			loggedIn = false;
		}

		if (loggedIn) {

			HttpSession session = Util.getSession();
			FacesContext.getCurrentInstance().getExternalContext().setResponseContentType("multipart/form-data");
			session.setAttribute("username", user);

			loggedIn = true;
			this.loggedIn = loggedIn;
			msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Seja bem-vindo", usuario.getNome());
			FacesContext.getCurrentInstance().addMessage(null, msg);
			context.addCallbackParam("loggedIn", loggedIn);
			return "./views/inicial";
		} else {

			loggedIn = false;
			this.loggedIn = loggedIn;
			msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Login Errado", "Usuário ou senha inválido!!");
			FacesContext.getCurrentInstance().addMessage(null, msg);
			context.addCallbackParam("loggedIn", loggedIn);
			return "index";
		}
	}

	public void isSessionValid() {

		try {
			FacesContext fc = FacesContext.getCurrentInstance();
			final FacesContext context = FacesContext.getCurrentInstance();
			final HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
			final HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
			session.invalidate();

			setCheckUsuarios(false);
			setCheckSafx0708(false);
			setCheckSafx04(false);
			setCheckconfig(false);
			setCheckSafx2013(false);
			isadmin = false;
			isativo = false;
			System.out.println("isSessionValid");

		} catch (Exception e) {
			System.out.println(" Error invalidating session :: " + e.getMessage());
		}
	}

	public String logout() {
		FacesContext fc = FacesContext.getCurrentInstance();
		final FacesContext context = FacesContext.getCurrentInstance();
		final HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
		final HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
		session.invalidate();

		setCheckUsuarios(false);
		setCheckSafx0708(false);
		setCheckSafx04(false);
		setCheckconfig(false);
		setCheckSafx2013(false);
		isadmin = false;
		isativo = false;
		System.out.println("LOGOUT");

		ExternalContext con = FacesContext.getCurrentInstance().getExternalContext();
		try {
			con.redirect(con.getRequestContextPath() + "/index.jsf");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "index";
	}

	public List<Usuario> getSelectedOptions() {
		return listUsers;

	}

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	public void setUser(String user) {
		this.user = user.toUpperCase();
	}

	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param senha
	 *            the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * @return the checkSafx04
	 */
	public Boolean getCheckSafx04() {
		return checkSafx04;
	}

	/**
	 * @param checkclientes
	 *            the checkSafx04 to set
	 */
	public void setCheckSafx04(Boolean checkSafx04) {
		this.checkSafx04 = checkSafx04;
	}

	/**
	 * @return the checkUsuarios
	 */
	public Boolean getCheckUsuarios() {
		return checkUsuarios;
	}

	/**
	 * @param checkUsuarios
	 *            the checkUsuarios to set
	 */
	public void setCheckUsuarios(Boolean checkUsuarios) {
		this.checkUsuarios = checkUsuarios;
	}

	/**
	 * @return the checkSafx0708
	 */
	public Boolean getCheckSafx0708() {
		return checkSafx0708;
	}

	/**
	 * @param checkorcamentos
	 *            the checkSafx0708 to set
	 */
	public void setCheckSafx0708(Boolean checkSafx0708) {
		this.checkSafx0708 = checkSafx0708;
	}

	/**
	 * @return the isadmin
	 */
	public Boolean getIsadmin() {
		return isadmin;
	}

	/**
	 * @param isadmin
	 *            the isadmin to set
	 */
	public void setIsadmin(Boolean isadmin) {
		this.isadmin = isadmin;
	}

	/**
	 * @return the isativo
	 */
	public Boolean getIsativo() {
		return isativo;
	}

	/**
	 * @param isativo
	 *            the isativo to set
	 */
	public void setIsativo(Boolean isativo) {
		this.isativo = isativo;
	}

	/**
	 * @return the checkpesquisa
	 */
	public Boolean getCheckpesquisa() {
		return checkpesquisa;
	}

	/**
	 * @param checkpesquisa
	 *            the checkpesquisa to set
	 */
	public void setCheckpesquisa(Boolean checkpesquisa) {
		this.checkpesquisa = checkpesquisa;
	}

	/**
	 * @return the checkconfig
	 */
	public Boolean getCheckconfig() {
		return checkconfig;
	}

	/**
	 * @param checkconfig
	 *            the checkconfig to set
	 */
	public void setCheckconfig(Boolean checkconfig) {
		this.checkconfig = checkconfig;
	}

	/**
	 * @return the checkSafx2013
	 */
	public Boolean getCheckSafx2013() {
		return checkSafx2013;
	}

	/**
	 * @param checkrelatorios
	 *            the checkSafx2013 to set
	 */
	public void setCheckSafx2013(Boolean checkSafx2013) {
		this.checkSafx2013 = checkSafx2013;
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

	public Boolean getLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(Boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

}
