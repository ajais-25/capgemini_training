package banking;

import banking.enums.Deposit;
import banking.exceptions.InvalidBalanceException;
import banking.exceptions.InvalidCredentialsException;

public abstract class BankAccount {
	private String accountNumber;
	private String name;
	private double balance;
	
	public String getAccountNumber() {
		return this.accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance(String accountNumber) {
		if(this.accountNumber.equals(accountNumber))
			return this.balance;
		throw new InvalidCredentialsException("Invalid user credentials");
	}
	
	public void setBalance(double balance, String accountNumber) {
		if(this.accountNumber.equals(accountNumber)) {
			if(balance < 0)
				throw new InvalidBalanceException("Invalid Balance");
			
			this.balance = balance;
			System.out.println("Balance updated!");
			return ;
		}
		throw new InvalidCredentialsException("Invalid user credentials");
	}
	
	abstract void deposit(String accountNumber, double amount, Deposit d);
	
	abstract void withdraw(String accountNumber, double amounts);
	
	abstract void withdraw(String accountNumber, double amount, String remark);
}
