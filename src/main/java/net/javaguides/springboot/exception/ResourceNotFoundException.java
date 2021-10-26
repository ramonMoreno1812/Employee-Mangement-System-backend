package net.javaguides.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// whenever resource not found in database, throw this exception
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

	
	private static final long serialVersionUID = 1L;
	
	// takes string and pass it to the super class;
	public ResourceNotFoundException(String message) {
		super(message);
	}
	
	

}
