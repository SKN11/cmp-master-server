package com.cmpmasterserver.exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;



@ControllerAdvice 
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	

	
	@ExceptionHandler(Exception.class) //override method of ResponseEntityExceptionHandler class  
	public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request)  
	{  
		
		ErrorFlowManagement errorFlowMgt= new ErrorFlowManagement(new Date().toString(), ex.getMessage(), request.getDescription(false));
		
		//returning exception structure and specific status   
		
		return new ResponseEntity(errorFlowMgt, HttpStatus.NOT_FOUND);
		//return new ResponseEntity<ErrorFlowManagement>(errorFlowMgt, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	@ExceptionHandler(CompanyNotFoundException.class)    //override method of ResponseEntityExceptionHandler class  
	public final ResponseEntity<Object> handleCompanyNotFoundExceptions(CompanyNotFoundException ex, WebRequest request)  
	{  
	//creating exception response structure  
		ErrorFlowManagement errorFlowMgt= new ErrorFlowManagement(new Date().toString(), ex.getMessage(), request.getDescription(false));  
	//returning exception structure and Not Found status   
	return new ResponseEntity(errorFlowMgt, HttpStatus.NOT_FOUND);  
	}
	
	
	
	
	
	
	   
}
