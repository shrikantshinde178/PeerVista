package com.peervista.pv.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.peervista.pv.entity.InsuranceProvider;
import com.peervista.pv.service.InsuranceProviderService;

@RestController
//Controller for all incoming request on ProviderService entity
public class InsuranceProviderController {

	@Autowired
	InsuranceProviderService is;
		
	// get mapping with parameter for bank as per loan categories
	@GetMapping("/getInsuranceProvider/{insuranceType}")
	public List<InsuranceProvider> getProviderByInsuranceType(@PathVariable("insuranceType") String insuranceType){
		return is.findByInsuranceType(insuranceType);		
	}
	
	// get mapping directly by fetProvideBank
	@GetMapping("/getInsuranceProvider")
	public List<InsuranceProvider> getAllProviders(){
		return is.fetchInsuranceDetails();
	}
		
}
