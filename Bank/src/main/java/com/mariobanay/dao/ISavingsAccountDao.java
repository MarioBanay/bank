package com.mariobanay.dao;

import org.springframework.data.repository.CrudRepository;

import com.mariobanay.domain.SavingsAccount;

public interface ISavingsAccountDao extends CrudRepository<SavingsAccount, Long> {
	
	SavingsAccount findByAccountNumber (int accountNumber);

}
