package com.mariobanay.service;

import java.util.Set;

import com.mariobanay.domain.User;
import com.mariobanay.domain.security.UserRole;

public interface IUserService {
	
	User saveUser (User user); 

	public User findByUsername(String username);

	public User findByEmail(String email);

	public boolean checkUserExists(String username, String email);

	public boolean checkUsernameExists(String username);

	public boolean checkEmailExists(String email);
	
	User createUser(User user, Set<UserRole> userRoles);
	
}
