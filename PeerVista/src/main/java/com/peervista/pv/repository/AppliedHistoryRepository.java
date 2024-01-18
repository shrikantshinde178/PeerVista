package com.peervista.pv.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.peervista.pv.entity.AppliedHistory;

public interface AppliedHistoryRepository extends JpaRepository<AppliedHistory, Integer> {
	

//	// 1. Fetch all applied policies
//	@Query("Select * from AppliedHistory")
//	List<AppliedHistory> findByPolicyId(int policyId);

	// 2. Fetch policy info by application status
	@Query("Select ah1 from AppliedHistory ah1 where ah1.applicationStatus=?1")
	List<AppliedHistory> findBygetAppliedPoliciesByStatus(String applicationStatus);
	
	// 3. If want's to fetch result based on specific query then write here
	@Query("Select ah2 from AppliedHistory ah2 where ah2.applicationId=?1")
	List<AppliedHistory> findBygetAppliedPoliciesByApplicationId(int applicationId);


}
