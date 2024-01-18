package com.peervista.pv.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.peervista.pv.entity.PaymentDetails;

public interface PaymentDetailsRepository extends JpaRepository<PaymentDetails, Integer> {
	
	// List<PaymentDetails> fetchPaymentDetails();
}
