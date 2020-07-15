package com.mariobanay.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mariobanay.domain.User;

public interface IUserDao extends CrudRepository<User, Long> {

	User findByUsername(String username);
	User findByEmail(String email);
    List<User> findAll();

}
