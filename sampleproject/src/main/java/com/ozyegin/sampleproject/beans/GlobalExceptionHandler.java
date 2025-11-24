package com.ozyegin.sampleproject.beans;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<String> runtimeExceptionHandler(RuntimeException ex) {
		String message = "An unexpected error occured";
		System.out.println(ex.toString());
		return new ResponseEntity<String>(message, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> generalExceptionHandler(Exception ex) {
		String message = "An error";
		System.out.println(ex.toString());
		return new ResponseEntity<String>(message, HttpStatus.SERVICE_UNAVAILABLE);
	}
}