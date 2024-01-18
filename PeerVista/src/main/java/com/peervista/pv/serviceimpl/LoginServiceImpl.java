package com.peervista.pv.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peervista.pv.entity.Login;
import com.peervista.pv.repository.LoginRepository;
import com.peervista.pv.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginRepository lRepo;

	@Override
	public Login loginUser(String userName, String password) {
		Login login = lRepo.findByUserNameAndPassword(userName, password);
		return login;	// here have to print only login, if wants to save then we can written the values in db.
	}
	

}
