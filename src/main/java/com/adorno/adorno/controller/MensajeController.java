package com.adorno.adorno.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adorno.adorno.modelo.entity.Mensaje;
import com.adorno.adorno.modelo.entity.Usuario;
import com.adorno.adorno.servicios.MensajeService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("api/mensajes")
@Slf4j
public class MensajeController {
	
	private final MensajeService mensajeService;
	
	public MensajeController(MensajeService mensajeService) {
		super();
		this.mensajeService = mensajeService;
	}

	@GetMapping("listar")
	public ResponseEntity<?> listarMensajes(){
		log.debug("Entrooo OOOOOOOOOO");

		return this.mensajeService.getAll();
	}
	
	@PostMapping("crear")
	public ResponseEntity<?> crearMensaje(@RequestBody Mensaje mensaje){
		return this.mensajeService.create(mensaje);
	}
	
	@PutMapping("likechange")
	public ResponseEntity<?> changeLike(@RequestBody Mensaje mensaje){
		return this.mensajeService.changeLike(mensaje);
	}
	
	@GetMapping("byusuario/{nombreUsuario}")
	public ResponseEntity<?> getByUsuarios(@PathVariable String nombreUsuario){
		// Esta parte esta hecha deprisa aprisa con prisa
		// Orientacion de que poner por parametro y si puedo aqui convertir
		// Se que aqui iria DTO y eso...
		log.debug(nombreUsuario);
	
		return this.mensajeService.getByUsuario(new Usuario(nombreUsuario, null));
	}
}
