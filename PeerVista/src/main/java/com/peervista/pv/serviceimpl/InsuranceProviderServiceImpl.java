package com.peervista.pv.serviceimpl;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peervista.pv.entity.InsuranceProvider;
import com.peervista.pv.repository.InsuranceProviderRepository;
import com.peervista.pv.service.InsuranceProviderService;

@Service
public class InsuranceProviderServiceImpl implements InsuranceProviderService {
	
	@Autowired
	//Repository object create here
	InsuranceProviderRepository ips;

	@Override
	public List<InsuranceProvider> findByInsuranceType(String insuranceType) {
		return ips.findByInsuranceType(insuranceType);
	}

	@Override
	public List<InsuranceProvider> fetchInsuranceDetails() {
		return ips.findAll();
	}

}

