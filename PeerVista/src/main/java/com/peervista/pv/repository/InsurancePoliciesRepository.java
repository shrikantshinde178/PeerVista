package com.peervista.pv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.peervista.pv.entity.InsurancePolicies;

public interface InsurancePoliciesRepository extends JpaRepository<InsurancePolicies, Integer> {
	
//	//Fetching loan offers based on total Insurance term plan
//	@Query("Select lo from InsurancePolicies lo where lo.loanTermMonths=?1")
//	List<LoanOffer> fetchInsurancePoliciesDetails(String insuranceType);

	
}
