package com.adorno.adorno.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adorno.adorno.modelo.entity.Mensaje;
import com.adorno.adorno.modelo.entity.Usuario;
import com.adorno.adorno.servicios.PiadorBaseDeDatos;

@CrossOrigin




@RestController
@RequestMapping("api/mensajes")
public class MensajeController {
	
	

	@GetMapping("todos")
	public ResponseEntity<?> listarMensajes(){

		return this.piadorBaseDeDatos.getAll();
	}
	
	
	
	@GetMapping("byusuario/{nombreUsuario}")
	public ResponseEntity<?> getByUsuarios(@PathVariable String nombreUsuario){
	
		return this.piadorBaseDeDatos.getByUsuario(new Usuario(nombreUsuario, null));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@PostMapping("nuevo")
	public ResponseEntity<?> crearMensaje(@RequestBody Mensaje mensaje){
		return this.piadorBaseDeDatos.create(mensaje);
	}
	
	@PutMapping("likechange")
	public ResponseEntity<?> changeLike(@RequestBody Mensaje mensaje){
		return this.piadorBaseDeDatos.changeLike(mensaje);
	}
	
private final PiadorBaseDeDatos piadorBaseDeDatos;
	
	public MensajeController(PiadorBaseDeDatos mensajeService) {
		super();
		this.piadorBaseDeDatos = mensajeService;
	}
}
