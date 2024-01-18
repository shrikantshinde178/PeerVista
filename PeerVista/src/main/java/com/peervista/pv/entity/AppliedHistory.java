package com.peervista.pv.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name ="AppliedHistory")
public class AppliedHistory {
	
	@Id		// Generate primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int applicationId;
	
	@Column(nullable = false)	// To show applied policy id
	private int policyId;
	
	@Column(nullable = false, length = 100)	// To show the applied policy name
	private String policyName;
	
	@NotBlank
	@Column(nullable = false, length = 100)	// To show confirmation status of the policy
	private String applicationStatus;
	
}
