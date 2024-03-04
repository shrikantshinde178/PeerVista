package com.peervista.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.peervista.service.BuyService;
import com.peervista.entity.Buy;
import java.util.List;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/buy")
public class BuyController {

    @Autowired
    private BuyService buyService;

    @PostMapping("/buy/{userId}/{policy_id}")
    public void buyPolicy(@PathVariable Long userId, @PathVariable Long policy_id) {
        buyService.buyPolicy(userId, policy_id);
    }

    @GetMapping("/buy-history")
    public List<Buy> getAllPurchases() {
        return buyService.getAllPurchases();
    }

    @GetMapping("/buy-history/{userId}")
    public List<Buy> getPurchasesByUserId(@PathVariable Long userId) {
        return buyService.getPurchasesByUserId(userId);
    }
}
