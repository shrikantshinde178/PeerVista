package com.peervista.pv.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name ="Login")
public class Login {

	@Id
	private int loginId;
	
	@NotBlank
	@Column(length=25, nullable = false)
	private String userName; 	// This is a standard format write userName like this.
	
	@NotBlank
	@Column(length=64, nullable = false)
	private String password;
	
}
