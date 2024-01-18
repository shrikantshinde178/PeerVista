package com.peervista.pv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.peervista.pv.entity.Login;

public interface LoginRepository extends JpaRepository<Login, Integer>{

	public Login findByUserNameAndPassword(String userName, String password);
}
