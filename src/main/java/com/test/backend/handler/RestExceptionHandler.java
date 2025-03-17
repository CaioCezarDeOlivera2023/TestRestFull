package com.test.backend.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.test.backend.model.error.ErrorMessage;
import com.test.backend.model.exception.ResourceNotFoundException;

@ControllerAdvice
public class RestExceptionHandler {
	/**
	 * Metodo para tratar uma exeção
	 * @param passa o produto inexistente
	 * @return retorna mensagem personalizada
	 */
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> handlerResourceNotFoundException(ResourceNotFoundException ex){
		ErrorMessage error = new ErrorMessage("Not Found", HttpStatus.NOT_FOUND.value(), ex.getMessage());
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
		
		
	}

}
