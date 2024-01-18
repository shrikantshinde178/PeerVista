package com.peervista.pv.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.peervista.pv.entity.Login;
import com.peervista.pv.service.LoginService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import jakarta.servlet.ServletException;

@RestController
public class LoginController {

	@Autowired
	LoginService ls;
	
	@PostMapping("/Login")
	public String validate(@RequestBody Login user)  throws ServletException{
		String jwtToken ="";
		if(user.getUserName() == null || user.getPassword() == null) {
			throw new ServletException("Mandotory to fill username & password");
		}
		
		String un =user.getUserName();
		String up = user.getPassword();
		user = ls.loginUser(un,up);
		
		if(user == null) {
			throw new ServletException("user details not found");
		}
		
		// This is a standard method write as it is
		jwtToken = Jwts.builder().setSubject(un).claim("roles", "user").setIssuedAt(new Date())
				.signWith(SignatureAlgorithm.HS256, "secretkey").compact();				
				
		return jwtToken;
	}

}
