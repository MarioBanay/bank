package com.mariobanay.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mariobanay.domain.Recipient;

public interface IRecipientDao extends CrudRepository<Recipient, Long> {
    
	List<Recipient> findAll();

    Recipient findByName(String recipientName);

    void deleteByName(String recipientName);
}
