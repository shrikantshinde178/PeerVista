package com.peervista.pv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.peervista.pv.entity.InsurancePolicies;
import com.peervista.pv.service.InsurancePoliciesService;

//each controller class should be declare @RestController initializer
@RestController		
public class InsurancePoliciesController {
	
	// Declaring object of InsurancePoliciesService & it is mandatory
	@Autowired
	InsurancePoliciesService ipc;	
	
	// Get mapping to fetch all InsurancePolicies in postman
	@GetMapping("/getInsurancePolicies")
	public List<InsurancePolicies> getinsurancePoliciesDetail(){
		return ipc.fetchLoanOfferDetails();
	}
	
	
	
	
		
}
