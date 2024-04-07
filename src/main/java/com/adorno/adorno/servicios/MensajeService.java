package com.adorno.adorno.servicios;

import org.springframework.http.ResponseEntity;

import com.adorno.adorno.modelo.entity.Mensaje;
import com.adorno.adorno.repositorios.MensajeRepository;
import com.adorno.adorno.repositorios.UsuarioRepository;

public class MensajeService implements Service<Mensaje, Long>{

	private final MensajeRepository mensajeRepo;
	private final UsuarioRepository usuarioRepo;
	
	public MensajeService(MensajeRepository mensajeRepo, UsuarioRepository usuarioRepo) {
		super();
		this.mensajeRepo = mensajeRepo;
		this.usuarioRepo = usuarioRepo;
	}

	@Override
	public ResponseEntity<?> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> create(Mensaje t) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
