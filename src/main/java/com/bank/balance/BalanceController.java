package com.bank.balance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank/v1/balance")
public class BalanceController {

	@Autowired
	BalanceService balanceService;
	
	@GetMapping("/get/{id}")
	public int getBalance(@PathVariable int id) {
		Balance balance = balanceService.getBalance(id);
		return balance.getBalance_ammount();
	}
}
