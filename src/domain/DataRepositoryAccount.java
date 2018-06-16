package domain;
import domain.Account;

public interface DataRepositoryAccount {
	 
	   // no-argument BankDatabase constructor initializes accounts
	   public Account getAccount(int accountNumber);
	   public boolean authenticateUser(int userAccountNumber, int userPIN);
	   public double getAvailableBalance(int userAccountNumber);
	   public double getTotalBalance(int userAccountNumber);
	   public void credit(int userAccountNumber, double amount);
	   public void debit(int userAccountNumber, double amount);
	   
}
