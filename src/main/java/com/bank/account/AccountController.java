package com.bank.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	@PostMapping(path="/create")
	public ResponseEntity<Object> createAccount(@RequestBody AccountDTO accountDTO) {
		System.out.println("It is entered here >> ");
		Account account = accountService.createAccount(accountDTO);
		return null;
	}
}
