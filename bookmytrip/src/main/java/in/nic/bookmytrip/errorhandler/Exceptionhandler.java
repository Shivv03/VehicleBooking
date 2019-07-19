package in.nic.bookmytrip.errorhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import in.nic.bookmytrip.exceptions.DuplicateEntryException;
import in.nic.bookmytrip.exceptions.DataNotFoundException;
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
			
		//add an exception handler for DuplicateEntryException
			@ExceptionHandler
			public ResponseEntity<ErrorResponse> handleException(DuplicateEntryException exc) {
				
				//create a studentErrorResponse
				ErrorResponse error = new ErrorResponse(HttpStatus.CONFLICT.value(),
																		exc.getMessage());
				
				//return ResponseEntity
				return new ResponseEntity<>(error,HttpStatus.CONFLICT);
			}
			
		//add another exception handler.. to catch any exception
			@ExceptionHandler
			public ResponseEntity<ErrorResponse> handleException(Exception exc) {
				
				//create a studentErrorResponse
				ErrorResponse error = new ErrorResponse(HttpStatus.BAD_REQUEST.value(),
																		exc.getMessage());
				
				//return ResponseEntity
				return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
			}
	
	

}
