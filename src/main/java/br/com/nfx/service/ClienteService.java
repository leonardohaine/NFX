package br.com.nfx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.nfx.dao.ClienteDAO;
import br.com.nfx.model.Cliente;

@Service("ClienteService")
@Transactional(readOnly = true)
public class ClienteService {

	@Autowired
	ClienteDAO clienteDAO;

	@Transactional(readOnly = false)
	public void salvar(Cliente cliente) {
		getClienteDAO().salvar(cliente);
	}

	@Transactional(readOnly = false)
	public void deleteCliente(Cliente cliente) {
		getClienteDAO().deleteCliente(cliente);
	}

	@Transactional(readOnly = false)
	public void updateCliente(Cliente cliente) {
		getClienteDAO().updateCliente(cliente);
	}

	public Cliente getClienteById(Long id) {
		return getClienteDAO().getClienteById(id);
	}

	/**
	 * @return the clienteDAO
	 */
	public ClienteDAO getClienteDAO() {
		return clienteDAO;
	}

	/**
	 * @param safx04DAO
	 *            the clienteDAO to set
	 */
	public void setClienteDAO(ClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO;
	}

	public List<Cliente> getCliente() {
		return getClienteDAO().getCliente();
	}
	
	public List<String> getCidade(String uf) {
		return getClienteDAO().getCidade(uf);
	}

}
