package com.adorno.adorno.servicios;

import org.springframework.http.ResponseEntity;

import com.adorno.adorno.modelo.dto.UsuarioDTO;
import com.adorno.adorno.repositorios.UsuarioRepository;

public class UsuarioService implements Service<UsuarioDTO, String>{

	private final UsuarioRepository UsuarioRepo;

	public UsuarioService(UsuarioRepository usuarioRepo) {
		super();
		UsuarioRepo = usuarioRepo;
	}

	@Override
	public ResponseEntity<?> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
}
