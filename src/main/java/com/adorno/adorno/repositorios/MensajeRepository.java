package com.adorno.adorno.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adorno.adorno.modelo.Mensaje;

public interface MensajeRepository extends JpaRepository<Mensaje,Long>{

}
