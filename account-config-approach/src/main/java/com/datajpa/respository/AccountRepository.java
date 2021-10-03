package com.datajpa.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datajpa.entities.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {

	@Override
	<S extends Account> S save(S entity);

}
