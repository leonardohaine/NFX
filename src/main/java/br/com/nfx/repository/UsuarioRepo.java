package br.com.nfx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.nfx.model.Usuario;

public interface UsuarioRepo extends JpaRepository<Usuario, Long> {

}
