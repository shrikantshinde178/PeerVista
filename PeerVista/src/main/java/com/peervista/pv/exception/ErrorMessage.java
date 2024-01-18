package com.peervista.pv.exception;

import org.springframework.http.HttpStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ErrorMessage {	
	
	// It contains the variable declaration which will be used to show error.
	// with the help of other methods.(global exception handler method is access this variables)
		private HttpStatus status;
		private String message;
	
		// private String invalid_email_message;

}