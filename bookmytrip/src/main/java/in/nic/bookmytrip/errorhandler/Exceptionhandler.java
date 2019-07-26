package in.nic.bookmytrip.errorhandler;

import java.util.List;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;

import in.nic.bookmytrip.exceptions.DataNotFoundException;
import in.nic.bookmytrip.exceptions.DuplicateEntryException;
import in.nic.bookmytrip.pojo.ErrorResponse;


@ControllerAdvice
public class Exceptionhandler {
	
	//add exception handling code here
	
		//adding exception handler for DataNotFoundException
			@ExceptionHandler
			public ResponseEntity<ErrorResponse> handleException(DataNotFoundException exc) {
				
				//create a studentErrorResponse
				ErrorResponse error = new ErrorResponse(HttpStatus.NOT_FOUND.value(),
																		exc.getMessage());
				
				//return ResponseEntity
				return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
			}
			
		//adding exception handler for DuplicateEntryException
			@ExceptionHandler
			public ResponseEntity<ErrorResponse> handleException(DuplicateEntryException exc) {
				
				//create a studentErrorResponse
				ErrorResponse error = new ErrorResponse(HttpStatus.CONFLICT.value(),
																		exc.getMessage());
				
				//return ResponseEntity
				return new ResponseEntity<>(error,HttpStatus.CONFLICT);
			}
			
			
		//adding exception handler.. to catch validation errors
			@ExceptionHandler
			public ResponseEntity<ErrorResponse> handleException(MethodArgumentNotValidException exc) {

				 BindingResult result = exc.getBindingResult();
				 List<FieldError> fieldErrors = result.getFieldErrors();
			     ErrorResponse error = new ErrorResponse();
			        
			        for (FieldError fieldError: fieldErrors) 
			        {
			        	error.addFieldError(fieldError.getField(), fieldError.getDefaultMessage());
			        } 
			     error.setStatus(HttpStatus.BAD_REQUEST.value());
			     error.setMessage("Validation Failed");
			     
			     return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
 
			}
		
			
		//adding another exception handler.. to catch any exception
			@ExceptionHandler
			public ResponseEntity<ErrorResponse> handleException(Exception exc) {
				
				//create a studentErrorResponse
				ErrorResponse error = new ErrorResponse(HttpStatus.BAD_REQUEST.value(),
																		exc.getMessage());
				
				//return ResponseEntity
				return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
			}
			
			@InitBinder
			public void initBinder(WebDataBinder dataBinder) {
				
				StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
				dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
			}
	
	

}
