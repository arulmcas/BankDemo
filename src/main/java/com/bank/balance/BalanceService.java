package com.bank.balance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BalanceService {

	@Autowired
	BalanceRepository balanceRepository;
	
	public Balance getBalance(int id) {
		Balance balance = balanceRepository.getById(id);
		return balance;
	}
}
