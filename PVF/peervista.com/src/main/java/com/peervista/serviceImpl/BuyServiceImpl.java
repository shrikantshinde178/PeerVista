package com.peervista.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.peervista.entity.Buy;
import com.peervista.entity.InsurancePolicy;
import com.peervista.entity.User;
import com.peervista.repository.BuyRepository;
import com.peervista.repository.InsurancePolicyRepository;
import com.peervista.repository.UserRepository;
import com.peervista.service.BuyService;

import java.util.List;

@Service
public class BuyServiceImpl implements BuyService {

    @Autowired
    private BuyRepository buyRepository;
    
    @Autowired
    private InsurancePolicyRepository insuPoli;
    
    @Autowired
    private UserRepository user;

    @Override
    public void buyPolicy(Long userId, Long policy_id) {
    	 Buy buyObj = new Buy();
    	 buyObj.setPolicy(insuPoli.findById(policy_id).get());
    	 buyObj.setUser(user.findById(userId).get());
         buyRepository.save(buyObj);
    }

    @Override
    public List<Buy> getAllPurchases() {
        return buyRepository.findAll();
    }

    @Override
    public List<Buy> getPurchasesByUserId(Long userId) {
        return buyRepository.findByUserUserId(userId);
    }
}
