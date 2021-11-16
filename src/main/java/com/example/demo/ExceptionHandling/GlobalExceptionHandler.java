package com.example.demo.ExceptionHandling;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	//handle specific exception
	@ExceptionHandler(InvalidOperation.class)
	public ResponseEntity<?> handleInvalidOperatonException (InvalidOperation invalidOperation, WebRequest request) {
		ExceptioDetails details = new ExceptioDetails(new Date(), invalidOperation.getMessage(), request.getDescription(false));
		return new ResponseEntity(details,HttpStatus.NOT_FOUND); 
	}
	
	//handle global exception
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleGlobalException (Exception exception, WebRequest request) {
		ExceptioDetails details = new ExceptioDetails(new Date(), exception.getMessage(), request.getDescription(false));
		return new ResponseEntity(details,HttpStatus.INTERNAL_SERVER_ERROR); 
	}
	
}
