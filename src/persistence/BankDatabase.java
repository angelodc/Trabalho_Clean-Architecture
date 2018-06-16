package persistence;

import domain.Account;
import domain.DataRepositoryAccount;

public class BankDatabase implements DataRepositoryAccount 
{

	private Account accounts[];
	
	public BankDatabase()
	   {
	      accounts = new Account[2]; // just 2 accounts for testing
	      accounts[0] = new Account(12345, 54321, 1000.0, 1200.0);
	      accounts[1] = new Account(98765, 56789, 200.0, 200.0);  
	   } // end no-argument BankDatabase constructor
	
	
	@Override
	public Account getAccount(int accountNumber) 
	{
		// loop through accounts searching for matching account number
	      for (Account currentAccount : accounts)
	      {
	         // return current account if match found
	         if (currentAccount.getAccountNumber() == accountNumber)
	            return currentAccount;
	      } // end for
	      return null; // if no matching account was found, return null
	}
	

	@Override
	public boolean authenticateUser(int userAccountNumber, int userPIN) 
	{
		// attempt to retrieve the account with the account number
	      Account userAccount = getAccount(userAccountNumber);

	      // if account exists, return result of Account method validatePIN
	      if (userAccount != null)
	         return userAccount.validatePIN(userPIN);
	      else
	         return false; // account number not found, so return false
	}
	

	@Override
	public double getAvailableBalance(int userAccountNumber) 
	{
		return getAccount(userAccountNumber).getAvailableBalance();
	}

	@Override
	public double getTotalBalance(int userAccountNumber) 
	{
		return getAccount(userAccountNumber).getTotalBalance();
	}

	@Override
	public void credit(int userAccountNumber, double amount) 
	{
	      getAccount(userAccountNumber).credit(amount);		
	}

	@Override
	public void debit(int userAccountNumber, double amount) 
	{
	      getAccount(userAccountNumber).debit(amount);		
	}

	
	
}
