package com.peervista.pv.exception;

public class PaymentDetailsNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public PaymentDetailsNotFoundException (String message) {
		super(message);
	}
	
}
