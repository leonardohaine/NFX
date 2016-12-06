package br.com.nfx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.nfx.dao.UsuarioDAO;
import br.com.nfx.model.Usuario;

@Service("UsuarioService")
@Transactional(readOnly = true)
public class UsuarioService {

	@Autowired
	UsuarioDAO usuarioDAO;

	@Transactional(readOnly = false)
	public void saveUsuario(Usuario usuarios) {
		getUsuarioDAO().saveUsuario(usuarios);
	}

	@Transactional(readOnly = false)
	public void deleteUsuario(Usuario usuarios) {
		getUsuarioDAO().deleteUsuario(usuarios);
	}

	@Transactional(readOnly = false)
	public void updateUsuario(Usuario usuarios) {
		getUsuarioDAO().updateUsuario(usuarios);
	}

	public Usuario getUsuarioById(Long id) {
		return getUsuarioDAO().getUsuarioById(id);
	}

	/**
	 * @return the usuarioDAO
	 */
	public UsuarioDAO getUsuarioDAO() {
		return usuarioDAO;
	}

	/**
	 * @param safx04DAO
	 *            the usuarioDAO to set
	 */
	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}

	public List<Usuario> getUsuario() {
		return getUsuarioDAO().getUsuario();
	}

}
