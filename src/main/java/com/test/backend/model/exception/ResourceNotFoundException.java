package com.test.backend.model.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
	static final long serialVersionUID = 1L;

	public ResourceNotFoundException(String mensagem){
		super(mensagem);
	}

}
