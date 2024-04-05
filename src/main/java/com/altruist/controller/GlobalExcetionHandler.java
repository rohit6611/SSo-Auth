package com.altruist.controller;

import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.altruist.response.StatusDescription;

@ControllerAdvice
public class GlobalExcetionHandler {

	
	@ExceptionHandler
	public ResponseEntity<StatusDescription> badRequestResponse(MethodArgumentNotValidException ex){
		StatusDescription statusDescription=new StatusDescription();
		statusDescription.setStatusCode(400);
		
		String errorMessage=ex.getBindingResult().getAllErrors().stream()
                .map(error -> {
                    String field = ((FieldError) error).getField();
                    String defaultMessage = error.getDefaultMessage();
                    return field + ": " + defaultMessage;
                })
                .collect(Collectors.joining(", "));
		statusDescription.setDescription(ex.getBindingResult().getAllErrors().get(0).getDefaultMessage());
		return new ResponseEntity<StatusDescription>(statusDescription,HttpStatus.BAD_REQUEST);
	}
	
}
