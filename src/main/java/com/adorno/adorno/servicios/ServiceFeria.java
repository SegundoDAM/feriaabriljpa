package com.adorno.adorno.servicios;

import org.springframework.http.ResponseEntity;

public interface ServiceFeria<T, ID> {
	
	ResponseEntity<?> getAll();
	ResponseEntity<?> getById(ID id);
	ResponseEntity<?> create(T t);
	
}
