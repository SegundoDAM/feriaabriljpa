package com.adorno.adorno.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.adorno.adorno.modelo.entity.Usuario;
import com.adorno.adorno.repositorios.UsuarioRepository;

@Service
public class UsuarioService implements ServiceFeria<Usuario, String>{

	private final UsuarioRepository UsuarioRepo;

	public UsuarioService(UsuarioRepository usuarioRepo) {
		super();
		UsuarioRepo = usuarioRepo;
	}

	@Override
	public ResponseEntity<?> getAll() {
		// TODO puiede que no haga falta - Chavero 07/04 - 19:35
		List<Usuario> usuarios=this.UsuarioRepo.findAll();
		return ResponseEntity.ok(usuarios);
	}

	@Override
	public ResponseEntity<?> getById(String id) {
		Optional<Usuario> usuarioOpt = this.UsuarioRepo.findById(id);
		if(usuarioOpt.isPresent()) {
			return ResponseEntity.ok(usuarioOpt.get());
		}
		return ResponseEntity.badRequest().body("Usuario no encontrado");
	}

	@Override
	public ResponseEntity<?> create(Usuario t) {
		
		if(this.UsuarioRepo.findById(t.getNombreUsuario()).get()!= null) {
			this.UsuarioRepo.save(t);
			return ResponseEntity.ok(true);
		}
		
		return ResponseEntity.badRequest().body(false);
	}
	
	
	
	
	
}
