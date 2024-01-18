package com.peervista.pv.entity;

import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PaymentDetails {
		
	@Id		// Id means the primary key
	private long paymentId;
	
	@Column(nullable = false, unique = true) // A unique identifier for each payment, typically an auto-generated primary key.
	private String transactionId;	
		
	@Column(nullable = false) 				// Many payments can be associated with one insurance policy, establishing a many-to-one relationship. 
	private int insurancePolicyId;			// Use the @ManyToOne annotation and a foreign key (policy_id in this example).
	
	@Column(nullable = false)
	private double amount;
	
	@Column(nullable = false)	
	private LocalDateTime localDateTimeOfPayment;	// importing LocalDateTime directly to print the current time. 
	
	@Column(nullable = false)
	private String paymentMethod;			// The method used for payment (credit card, bank transfer, etc.)

//	@Entity
//	public class Payment {
//
//	    @Id
//	    @GeneratedValue(strategy = GenerationType.IDENTITY)
//	    private Long Paymentid;
//
		// Many payments can be associated with one insurance policy, establishing a many-to-one relationship. Use the @ManyToOne annotation and a foreign key (policy_id in this example).
//	    @ManyToOne
//	    @JoinColumn(name = "policy_id", nullable = false)
//	    private InsurancePolicy insurancePolicy;	
//

//	}

}
