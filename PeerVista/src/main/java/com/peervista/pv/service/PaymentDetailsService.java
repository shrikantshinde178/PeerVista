package com.peervista.pv.service;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.peervista.pv.entity.PaymentDetails;

@Service
@Configuration
public interface PaymentDetailsService {
			
	List<PaymentDetails> fetchPaymentDetail(); // This is custom method I can define any method name.
												  // PaymentDetails is an entity name.
}													
