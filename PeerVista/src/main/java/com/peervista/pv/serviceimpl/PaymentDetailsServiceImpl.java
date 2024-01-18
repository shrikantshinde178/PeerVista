package com.peervista.pv.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peervista.pv.entity.PaymentDetails;
import com.peervista.pv.repository.PaymentDetailsRepository;
import com.peervista.pv.service.PaymentDetailsService;

@Service 	// this class act as a service only when @Service annotation is declared
public class PaymentDetailsServiceImpl implements PaymentDetailsService{
	
	@Autowired
	PaymentDetailsRepository pdr;	// Necessary to create the object of particular service's.

	@Override
	public List<PaymentDetails> fetchPaymentDetail() {
			return pdr.findAll();
	}

}
