package br.com.nfx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.nfx.model.Empresa;
import br.com.nfx.dao.EmpresaDAO;

@Service("EmpresaService")
@Transactional(readOnly = true)
public class EmpresaService {

	@Autowired
	EmpresaDAO empresaDAO;

	@Transactional(readOnly = false)
	public void saveEmpresa(Empresa empresa) {
		getEmpresaDAO().saveEmpresa(empresa);
	}

	@Transactional(readOnly = false)
	public void deleteEmpresa(Empresa empresa) {
		getEmpresaDAO().deleteEmpresa(empresa);
	}

	@Transactional(readOnly = false)
	public void updateEmpresa(Empresa empresa) {
		getEmpresaDAO().updateEmpresa(empresa);
	}

	public Empresa getEmpresaById(Long id) {
		return getEmpresaDAO().getEmpresaById(id);
	}

	/**
	 * @return the empresaDAO
	 */
	public EmpresaDAO getEmpresaDAO() {
		return empresaDAO;
	}

	/**
	 * @param safx04DAO
	 *            the empresaDAO to set
	 */
	public void setEmpresaDAO(EmpresaDAO empresaDAO) {
		this.empresaDAO = empresaDAO;	
	}

	public List<Empresa> getEmpresa() {
		return getEmpresaDAO().getEmpresa();
	}

}
