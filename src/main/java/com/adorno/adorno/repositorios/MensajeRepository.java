package com.adorno.adorno.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adorno.adorno.modelo.entity.Mensaje;
import com.adorno.adorno.modelo.entity.Usuario;

public interface MensajeRepository extends JpaRepository<Mensaje,Long>{
	List<Mensaje> findByUsuario(Usuario usuario);
}
