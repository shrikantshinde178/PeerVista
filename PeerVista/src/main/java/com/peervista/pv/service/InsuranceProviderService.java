package com.peervista.pv.service;

import java.util.*;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import com.peervista.pv.entity.InsuranceProvider;


@Service
@Configuration
public interface InsuranceProviderService {
	
	// ------------- User can only see (Read Only Permission) ---------------------
	
		
	// 1st search Fetch hotel list from db table as per insuranceType 
	List<InsuranceProvider> findByInsuranceType(String insuranceType);
	
	// fetching all providers
	List<InsuranceProvider> fetchInsuranceDetails();

	}

