package com.peervista.service;

import com.peervista.entity.Buy;
import java.util.List;

public interface BuyService {
	
    void buyPolicy(Long userId, Long policy_id);
    
    List<Buy> getAllPurchases();
    
    List<Buy> getPurchasesByUserId(Long userId);
}
