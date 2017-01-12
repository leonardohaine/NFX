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
	public void salvar(Empresa empresa) {
		getEmpresaDAO().salvar(empresa);
	}

	@Transactional(readOnly = false)
	public void deletar(Empresa empresa) {
		getEmpresaDAO().deletar(empresa);
	}

	@Transactional(readOnly = false)
	public void atualizar(Empresa empresa) {
		getEmpresaDAO().atualizar(empresa);
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

	public void setEmpresaDAO(EmpresaDAO empresaDAO) {
		this.empresaDAO = empresaDAO;	
	}

	public List<Empresa> getEmpresa() {
		return getEmpresaDAO().getEmpresa();
	}
	
	public List<String> getCidade(String uf) {
		return getEmpresaDAO().getCidade(uf);
	}

}
