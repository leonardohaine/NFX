package br.com.nfx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.nfx.model.Cliente;

public interface ClienteRepo extends JpaRepository<Cliente, Long> {

}
