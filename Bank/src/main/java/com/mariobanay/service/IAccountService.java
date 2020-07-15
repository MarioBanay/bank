package com.mariobanay.service;

import java.security.Principal;

import com.mariobanay.domain.PrimaryAccount;
import com.mariobanay.domain.SavingsAccount;

public interface IAccountService {
	
	public PrimaryAccount createPrimaryAccount();
	public SavingsAccount createSavingsAccount();
	public void deposit(String accountType, double amount, Principal principal);
	public void withdraw(String accountType, double amount, Principal principal);

}
