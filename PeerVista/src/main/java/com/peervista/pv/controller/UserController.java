package com.peervista.pv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.peervista.pv.entity.User;
import com.peervista.pv.service.UserService;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
@RestController
public class UserController {

	@Autowired
	UserService cs;
	
	//using post mapping to add User details with httpstatus created & code 201
	@PostMapping("/registerUser/")
	//valid - will check all validation of User entity during runtime
	//Requestbody - indicates method parameter should be bound to the body of the web request
	public ResponseEntity<User> saveUser(@Valid @RequestBody User user){
		return new ResponseEntity<User>(cs.registerUser(user),HttpStatus.CREATED);
	}
	
	// fetching the specific user by UserID
	@GetMapping("/fetchUser/{UserID}")
	public ResponseEntity<User> fetchUser(@PathVariable("UserID") int UserID){
		return new ResponseEntity<User>(cs.fetchDetails(UserID), HttpStatus.OK);	
	}
	
	// can edit the already registered user within the system.
	@PutMapping("/editUser/{UserID}")
	public ResponseEntity<User> editUser(@Valid @PathVariable("UserID") int UserID,
		@RequestBody User User){
		return new ResponseEntity<User>(cs.editUser(User, UserID), HttpStatus.OK);
	}

	// As per peer vista I don't give this feature to user as per application rules.
	// using delete mapping to remove customer based on id with 
	@DeleteMapping("/deleteUser/{UserID}")
	public ResponseEntity<String> deleteCustomer(@PathVariable("UserID") int UserID){
		cs.removeUser(UserID);
		return new ResponseEntity<String>("Successfully removed the user record from the system.", HttpStatus.OK);
	}
}
