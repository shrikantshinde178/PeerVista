package com.peervista.pv.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class InsurancePolicies {

    // --------- User can only see ------------

    @Id
    private int policyId; 					// Policy ID for finding all information about policies.
    
    @Column(length = 100, nullable = false)
    private String policy_name;  			 // Name of the policy
    
    @Column(length = 10, nullable = false)
    private double coverageAmount; 			  // Coverage amount in currency

    @Column(length = 2, nullable = false)
    private int policyTermMonths; 			   // Policy term in months

    @Column(length = 100, nullable = false)
    private String policyCoverageDescription;  // Description of the coverage

    @Column(length = 100, nullable = false)
    private String eligibilityRequirements; 	// Eligibility requirements for the policy

    @Column(length = 10, nullable = false)
    private String premiumPaymentFrequency; 	// Frequency of premium payments (e.g., monthly, annually)

    @Column(length = 2, nullable = false)
    private double premiumAmount; 				// Annual premium amount in currency

    @Column(length = 5, nullable = false)
    private int creditScoreRequirement; 		// Minimum required credit score for the policy

    @Column(length = 50, nullable = false)
    private double incomeRequirement; 			// Minimum income requirement for the policy
    
    @Column(length =  10, nullable = false)
    private int provider_id;

    //declare a many-to-one relationship. It indicates that each instance of the entity (InsurancePolicies) can be associated with one instance of another entity (InsuranceProvider).
//    @ManyToOne
//    @JoinColumn(name = "provider_id", nullable = false)
//    private int InsuranceProvider;
    
}
