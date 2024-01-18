package com.peervista.pv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peervista.pv.entity.PaymentDetails;
import com.peervista.pv.service.PaymentDetailsService;

@RestController 	// It only acts as a controller, if @RestController annotation will declare
public class PaymentDetailsController {

	@Autowired
	PaymentDetailsService pds;
	
	// get mapping to fetch in postman by get
	@GetMapping("/getPaymentDetails")
		public List<PaymentDetails> getPaymentDetails(){
			return pds.fetchPaymentDetail();
	}
	
}
