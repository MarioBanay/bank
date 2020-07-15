package com.mariobanay.service;

import java.security.Principal;
import java.util.List;

import com.mariobanay.domain.PrimaryAccount;
import com.mariobanay.domain.PrimaryTransaction;
import com.mariobanay.domain.Recipient;
import com.mariobanay.domain.SavingsAccount;
import com.mariobanay.domain.SavingsTransaction;

public interface ITransactionService {

	public List<PrimaryTransaction> findPrimaryTransactionList(String username);

	public List<SavingsTransaction> findSavingsTransactionList(String username);

	public void savePrimaryDepositTransaction(PrimaryTransaction primaryTransaction);

	public void saveSavingsDepositTransaction(SavingsTransaction savingsTransaction);
	
	public void savePrimaryWithdrawTransaction(PrimaryTransaction primaryTransaction);
	
	public void saveSavingsWithdrawTransaction(SavingsTransaction savingsTransaction);
	
	public void betweenAccountsTransfer(String transferFrom, String transferTo, String amount, PrimaryAccount primaryAccount, SavingsAccount savingsAccount) throws Exception;

	public List<Recipient> findRecipientList(Principal principal);
	
	public Recipient saveRecipient(Recipient recipient);
	
	public Recipient findRecipientByName(String recipientName);
	
	public void deleteRecipientByName(String recipientName);
	
	public void toSomeoneElseTransfer(Recipient recipient, String accountType, String amount, PrimaryAccount primaryAccount, SavingsAccount savingsAccount);

}
