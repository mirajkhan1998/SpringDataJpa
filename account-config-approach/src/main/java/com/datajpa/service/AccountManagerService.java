package com.datajpa.service;

import org.springframework.beans.BeanUtils;

import com.datajpa.dto.AccountDto;
import com.datajpa.entities.Account;
import com.datajpa.respository.AccountRepository;

public class AccountManagerService {

	private AccountRepository accountRepository;

	public int saveAccount(AccountDto accountDto) {
		Account account = null;
		account = new Account();
		BeanUtils.copyProperties(accountDto, account);
		account = accountRepository.save(account);

		return account.getAccountNo();

	}

	public void setAccountRepository(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

}
