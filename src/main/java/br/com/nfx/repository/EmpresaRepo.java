package br.com.nfx.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.nfx.model.Empresa;

public interface EmpresaRepo extends JpaRepository<Empresa, Long> {

}
