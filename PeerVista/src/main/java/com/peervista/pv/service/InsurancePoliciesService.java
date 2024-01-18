package com.peervista.pv.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.peervista.pv.entity.InsurancePolicies;

@Service
public interface InsurancePoliciesService {
	
	// ------------- User can only see (Read Only Permission) ---------------------

	// fetch all offers from db 
	List<InsurancePolicies> fetchLoanOfferDetails();
	
}
