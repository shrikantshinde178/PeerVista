package com.peervista.pv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.peervista.pv.entity.InsuranceProvider;
import java.util.List;

//repository to get pre-defined method of JPA repository for ProviderBank entity
public interface InsuranceProviderRepository extends JpaRepository<InsuranceProvider, Integer> {

	//custom query using jpql
	//fetching provider bank names as per loanCategories
	//pb ko * ki tarah use kiya hai, coz java will not understand * syntax of mysql
	@Query("Select pb from InsuranceProvider pb where pb.insuranceType=?1")
	List<InsuranceProvider> findByInsuranceType(String insuranceType);
}
