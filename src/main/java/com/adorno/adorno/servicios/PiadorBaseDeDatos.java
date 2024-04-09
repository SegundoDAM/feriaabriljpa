package com.adorno.adorno.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.adorno.adorno.modelo.entity.Mensaje;
import com.adorno.adorno.modelo.entity.Usuario;
import com.adorno.adorno.repositorios.MensajeRepository;
import com.adorno.adorno.repositorios.UsuarioRepository;

@Service
public class PiadorBaseDeDatos implements ServiceFeria<Mensaje, Long>{

	private final MensajeRepository mensajeRepo;
	private final UsuarioRepository usuarioRepo;
	
	public PiadorBaseDeDatos(MensajeRepository mensajeRepo, UsuarioRepository usuarioRepo) {
		super();
		this.mensajeRepo = mensajeRepo;
		this.usuarioRepo = usuarioRepo;
	}

	@Override
	public ResponseEntity<?> getAll() {
		List<Mensaje> mensajes = this.mensajeRepo.findAll();
		return ResponseEntity.ok(mensajes);
	}

	@Override
	public ResponseEntity<?> getById(Long id) {
		Optional<Mensaje> mensajeOptional =this.mensajeRepo.findById(id);
		if(mensajeOptional.isPresent()) {
			return ResponseEntity.ok(mensajeOptional.get());
		}
		return ResponseEntity.badRequest().body("No existe el mensaje "+id);
	}

	@Override
	public ResponseEntity<?> create(Mensaje t) {
		
		if(this.usuarioRepo.findById(t.getUsuario().getNombreUsuario()).isEmpty()) {
			this.usuarioRepo.save(t.getUsuario());
		}
		
		Mensaje mensaje = this.mensajeRepo.save(t);
		return new ResponseEntity<Mensaje>(mensaje, HttpStatus.OK);
	}

	public ResponseEntity<?> changeLike(Mensaje mensaje){
		
		Optional<Mensaje> mensajeDbOptional = this.mensajeRepo.findById(mensaje.getId());

		Boolean likeChanged= false;
		
		if(mensajeDbOptional.isPresent()) {
			
			mensajeDbOptional.get().setLikes(mensaje.isLikes());
			this.mensajeRepo.save(mensajeDbOptional.get());
			likeChanged = true;
			return new ResponseEntity<Boolean>(likeChanged, HttpStatus.OK); 
		}
		
		return new ResponseEntity<String>("Mensaje no existente", HttpStatus.BAD_REQUEST);
	}

	public ResponseEntity<?> getByUsuario(Usuario usuario){
		if(usuario.getNombreUsuario()!=null) {
			Optional<Usuario> usuarioBD = this.usuarioRepo.findById(usuario.getNombreUsuario()); 
			if(usuarioBD.isPresent()) {
				List<Mensaje> mensajes = this.mensajeRepo.findByUsuario(usuarioBD.get());
				return new ResponseEntity<List<Mensaje>>(mensajes, HttpStatus.OK);
			}
		}
		return ResponseEntity.badRequest().body("Usuario no existe");
	}
	
}
