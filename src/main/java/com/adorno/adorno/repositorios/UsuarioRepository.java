package com.adorno.adorno.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adorno.adorno.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,String> {

}
