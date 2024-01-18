package com.peervista.pv.service;

import com.peervista.pv.entity.User;

//abstract methods for performing CRUD on entity customer.
public interface UserService {
	
	// ------------- User can (Read-Write-Modify Permissions) ---------------------
	
	//register new customer in db table
	User registerUser(User user);
	
	//for edit option based on id from db table
	User editUser(User user, int UserID);
	
	//remove account based on id from db table
	void removeUser(int UserID);
	
	//fetch details based on id from db table
	User fetchDetails(int UserID);
}
