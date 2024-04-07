package com.adorno.adorno.servicios;

import org.springframework.http.ResponseEntity;

public interface Service<T, ID> {
	
	ResponseEntity<?> getAll();
	ResponseEntity<?> getById(ID id);
	
	
}
