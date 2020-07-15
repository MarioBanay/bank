package com.mariobanay.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mariobanay.domain.SavingsTransaction;

public interface ISavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {

	List<SavingsTransaction> findAll();
}
