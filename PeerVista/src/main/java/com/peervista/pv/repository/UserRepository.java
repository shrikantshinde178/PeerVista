package com.peervista.pv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.peervista.pv.entity.User;

//repository to get pre-defined method of JPA repository.
public interface UserRepository extends JpaRepository<User, Integer> {

	//custom query dal
}
