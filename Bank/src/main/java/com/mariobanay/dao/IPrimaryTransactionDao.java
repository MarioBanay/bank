package com.mariobanay.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mariobanay.domain.PrimaryTransaction;

public interface IPrimaryTransactionDao extends CrudRepository<PrimaryTransaction, Long> {

	List<PrimaryTransaction> findAll();
}
