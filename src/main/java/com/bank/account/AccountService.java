package com.bank.account;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.bytebuddy.asm.Advice.Return;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;
	
	public Account createAccount(AccountDTO accountDTO) {
		Account account = accountRepository.save(convertAccount.apply(accountDTO));
		return account;
	}
	
	Function<AccountDTO, Account> convertAccount = accountDTO -> {
		Account account = new Account();
		account.setFirstname(accountDTO.getFirstname());
		account.setLastname(accountDTO.getLastname());
		account.setUsername(accountDTO.getUsername());
		account.setPassword(accountDTO.getPassword());
		account.setBalance(accountDTO.getBalance());
		return account;
	};
}
