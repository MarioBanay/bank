package com.mariobanay.dao;

import org.springframework.data.repository.CrudRepository;

import com.mariobanay.domain.PrimaryAccount;

public interface IPrimaryAccountDao extends CrudRepository<PrimaryAccount, Long> {
	
	PrimaryAccount findByAccountNumber (int accountNumber);

}
