package com.peervista.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.peervista.entity.Buy;
import java.util.List;

@EnableJpaRepositories
@Repository
public interface BuyRepository extends JpaRepository<Buy, Long> {
	
//    List<Buy> findByUserId(Long userId);
    List<Buy> findByUserUserId(Long userId);
}
