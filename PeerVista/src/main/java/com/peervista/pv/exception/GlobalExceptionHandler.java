package com.peervista.pv.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	
	// Global exception for wrong user id search
	@ExceptionHandler(UserIdNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleCustomerException(UserIdNotFoundException ex, WebRequest request) {
		ErrorMessage em = new ErrorMessage(HttpStatus.NOT_FOUND, ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(em);
	}

	// Global exception for wrong loan offer search
	@ExceptionHandler(InsurancePoliciesNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleInsurancePolicyException(
		InsurancePoliciesNotFoundException lonfEx, WebRequest request){
		ErrorMessage em = new ErrorMessage(HttpStatus.NOT_FOUND, lonfEx.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(em);
	}
	
	//below search is not implemented via particular id search
	// Global exception for wrong payment details search
	@ExceptionHandler(PaymentDetailsNotFoundException.class)
	public ResponseEntity<ErrorMessage> handlePaymentException(
		PaymentDetailsNotFoundException pdnfEx, WebRequest request){
		ErrorMessage em = new ErrorMessage(HttpStatus.NOT_FOUND, pdnfEx.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(em);
	}
	
	// Global exception for applicationId enter to search applied policies history
		@ExceptionHandler(AppliedHistoryNotFoundException.class)
		public ResponseEntity<ErrorMessage> handleAppliedHistoryException(
			AppliedHistoryNotFoundException ahnfEx, WebRequest request){
			ErrorMessage em = new ErrorMessage(HttpStatus.NOT_FOUND, ahnfEx.getMessage());
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(em);
		}

}
