package com.peervista.pv.entity;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.Email;
@Entity
@Getter
@Setter
@Table(name="UserInfo")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int UserID;
	
	@Column(length = 25, nullable = false)
	@NotBlank(message="User name is mandetory to fill")
	private String Username;

	@Column(length = 25, nullable = false)
	@NotBlank(message="Surname is mandetory to fill")
	private String Surname;
	
	@Column(length = 25, nullable = false, unique = true)
	@NotBlank(message = "Email Id is mandetory to fill")
	@Email(message = "User email is not proper according to norms")
	private String UEmail;
	
	@Column(length = 12, nullable = false, unique = true)
	@NotNull(message = "Phone number is mandetory")
	private long UPhone;
	
	@Column(length = 40, nullable = false)
	@NotBlank(message = "Address is mandetory")
	private String UAddress;
}
