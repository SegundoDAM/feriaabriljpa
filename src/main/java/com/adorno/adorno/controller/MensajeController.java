package com.adorno.adorno.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adorno.adorno.modelo.entity.Mensaje;
import com.adorno.adorno.servicios.MensajeService;

@RestController
@RequestMapping("api/mensajes")
public class MensajeController {
	
	private final MensajeService mensajeService;
	
	public MensajeController(MensajeService mensajeService) {
		super();
		this.mensajeService = mensajeService;
	}

	@GetMapping("listar")
	public ResponseEntity<?> listarMensajes(){
		return this.mensajeService.getAll();
	}
	
	@PostMapping("crear")
	public ResponseEntity<?> crearMensaje(@RequestBody Mensaje mensaje){
		return this.mensajeService.create(mensaje);
	}
}
