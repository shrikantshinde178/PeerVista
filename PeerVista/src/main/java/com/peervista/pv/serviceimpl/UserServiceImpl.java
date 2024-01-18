package com.peervista.pv.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.peervista.pv.entity.User;
import com.peervista.pv.exception.UserIdNotFoundException;
import com.peervista.pv.repository.UserRepository;
import com.peervista.pv.service.UserService;

//Business logic for User
@Service
public class UserServiceImpl implements UserService{
	
	//declaring repo
	@Autowired // getter-setter constructor calling by this annotation
	UserRepository UserRepo;
	
	//registering user into db table using .save method of JpaRepository
	@Override
	public User registerUser(User user) {
		return UserRepo.save(user);
	}
	
	// editing User details using findById() & save() of JpaRepository 
	@Override
	public User editUser(User user, int UserID) {
	//fetch User data based on id, if not found throw exception 
	User updatedUserdetails = UserRepo.findById(UserID).orElseThrow(() -> new UserIdNotFoundException("Entered User id is not proper / Invalid"));
	//set new values to User entity
	updatedUserdetails.setUPhone(user.getUPhone());
	updatedUserdetails.setUAddress(user.getUAddress());
	
	UserRepo.save(updatedUserdetails); //saving updated info in User Entity
	return updatedUserdetails;
	}

	//Removing the User record from db table using deleteById() of JpsRepository.
	@Override
	public void removeUser(int UserID) {
	UserRepo.findById(UserID).orElseThrow(()-> new UserIdNotFoundException("User Id is Invalid"));
	UserRepo.deleteById(UserID);
	}

	//fetch an customer record from db table using findById() of JpaRepository
	@Override
	public User fetchDetails(int UserID) {
		//fetch customer data based on id, if not found throw exception 
		return UserRepo.findById(UserID).orElseThrow(() -> new UserIdNotFoundException("Entered user id is invalid or not present in the server!"));
	}

	//fetching User record using findById()
	//removing an User record from db table using deleteById() of JpaRepository
	

}


