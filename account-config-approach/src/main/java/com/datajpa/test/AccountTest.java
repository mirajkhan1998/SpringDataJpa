package com.datajpa.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.datajpa.dto.AccountDto;
import com.datajpa.service.AccountManagerService;

public class AccountTest {

	public static void main(String[] args) {

		ApplicationContext applicationContext = null;
		AccountManagerService service = null;
		applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
		AccountDto accountDto = null;

		service = applicationContext.getBean("accountManagerService", AccountManagerService.class);
		accountDto = new AccountDto();
		accountDto.setAccountHolderName("Rick");
		accountDto.setAccountType("Saving");
		accountDto.setBalance(556555);
		accountDto.setBranch("chalkusha");
		int acccountNo = service.saveAccount(accountDto);
		System.out.println("AccountNo:" + acccountNo);
	}

}
