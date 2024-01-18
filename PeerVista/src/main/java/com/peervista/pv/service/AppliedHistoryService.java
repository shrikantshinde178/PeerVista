package com.peervista.pv.service;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.peervista.pv.entity.AppliedHistory;

@Service
@Configuration
public interface AppliedHistoryService {
   
   // 1. Save/Store multiple records
   AppliedHistory registerToPolicy(AppliedHistory appliedHistory);
   
   // 2. Fetch records by application id
   List<AppliedHistory> getAppliedPoliciesByApplicationId(int applicationId);
   
   // 3. Fetch records by policy status
   List<AppliedHistory> getAppliedPoliciesByStatus(String applicationStatus);
   
   // 4. Fetch records
   List<AppliedHistory> getAllAppliedHistory();

}
