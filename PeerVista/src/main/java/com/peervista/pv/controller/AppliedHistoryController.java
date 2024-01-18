package com.peervista.pv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.peervista.pv.entity.AppliedHistory;
import com.peervista.pv.service.AppliedHistoryService;

import jakarta.validation.Valid;

@RestController
public class AppliedHistoryController {

	@Autowired
	AppliedHistoryService ahs;

	// 1. Post mapping to register for policy
	@PostMapping("/registerToTheNewPolicy")
	public ResponseEntity<AppliedHistory> saveAppliedHistory(@Valid @RequestBody AppliedHistory appliedHistory){
		return new ResponseEntity<AppliedHistory>(ahs.registerToPolicy(appliedHistory), HttpStatus.CREATED);
	}
	
	// 2. Get mapping with parameter for policies as per application-id
	@GetMapping("/getAppliedPoliciesByapplicationId/{applicationId}")
	public List<AppliedHistory> getAppliedPoliciesByApplicationId(@PathVariable("applicationId") int applicationId){
	return ahs.getAppliedPoliciesByApplicationId(applicationId);
	}
	
	// 3. Get mapping to fetch the policy by status(Pending/Approved/Rejected) 
	@GetMapping("getAppliedHistory/{status}")
	public List<AppliedHistory> getAppliedPoliciesByStatus(@PathVariable("status") String status){
		return ahs.getAppliedPoliciesByStatus(status);
	}
	
	// 4. Get mapping to fetch all applied policies
	@GetMapping("/getAppliedPolicies")
	public List<AppliedHistory> getAppliedHistories(){
		return ahs.getAllAppliedHistory();
	}
		
}
