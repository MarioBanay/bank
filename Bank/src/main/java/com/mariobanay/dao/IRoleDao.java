package com.mariobanay.dao;

import org.springframework.data.repository.CrudRepository;

import com.mariobanay.domain.security.Role;


public interface IRoleDao extends CrudRepository<Role, Integer> {
    Role findByName(String name);
}
