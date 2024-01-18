package com.peervista.pv.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.peervista.pv.entity.InsurancePolicies;
import com.peervista.pv.repository.InsurancePoliciesRepository;
import com.peervista.pv.service.InsurancePoliciesService;

@Service
public class InsurancePoliciesServiceImpl implements InsurancePoliciesService{

	// creating object of service repo(InsurancePoliciesRepository) & it's mandatory to access the methods of this repo.
	@Autowired
	InsurancePoliciesRepository lor;
	
	public List<InsurancePolicies> fetchLoanOfferDetails(){
		return lor.findAll();
	}

}