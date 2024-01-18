package com.peervista.pv.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peervista.pv.entity.AppliedHistory;
import com.peervista.pv.repository.AppliedHistoryRepository;
import com.peervista.pv.service.AppliedHistoryService;

@Service
public class AppliedHistoryServiceImpl implements AppliedHistoryService {
   
   @Autowired
   AppliedHistoryRepository ahRepo;

		// Apply and save policy within database 
		@Override
		public AppliedHistory registerToPolicy(AppliedHistory appliedHistory) {
			return ahRepo.save(appliedHistory);
		}
		
		// To fetch the policy by application id 
		@Override
		public List<AppliedHistory> getAppliedPoliciesByApplicationId(int applicationId) {
			return ahRepo.findBygetAppliedPoliciesByApplicationId(applicationId);
		}
		
		// To fetch the policy by status(Pending/Approved/Rejected)
		@Override
		public List<AppliedHistory> getAppliedPoliciesByStatus(String applicationStatus) {
			return ahRepo.findBygetAppliedPoliciesByStatus(applicationStatus);
		}
		
		// Fetch all applied policies saved within the table
		@Override
		public List<AppliedHistory> getAllAppliedHistory() {
			return ahRepo.findAll();
		}

}
