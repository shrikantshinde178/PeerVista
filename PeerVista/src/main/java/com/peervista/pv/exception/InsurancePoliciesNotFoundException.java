package com.peervista.pv.exception;

public class InsurancePoliciesNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public InsurancePoliciesNotFoundException(String message) {
		super(message);
	}
}
