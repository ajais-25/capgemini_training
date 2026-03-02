package banking;

import banking.enums.Deposit;
import banking.exceptions.InsufficientBalanceException;
import banking.exceptions.InvalidCredentialsException;

public class SavingsAccount extends BankAccount {
	
	public SavingsAccount(String accountNumber, String name) {
		this.setAccountNumber(accountNumber);
		this.setName(name);
	}

	void deposit(String accountNumber, double amount, Deposit d) {
		if(this.getAccountNumber().equals(accountNumber)) {
			double balance = this.getBalance(accountNumber);
			
			this.setBalance((balance + amount), accountNumber);
			
			System.out.println("Amount Deposited via, " + d + ", Balance: " + (balance + amount));
			
			return ;
 		}
		throw new InvalidCredentialsException("Invalid user credentials");
	}

	public void withdraw(String accountNumber, double amount) {
		if(this.getAccountNumber().equals(accountNumber)) {
			double balance = this.getBalance(accountNumber);
			
			if((balance - amount) >= 0) {
				double updatedBalance = balance - amount;
				this.setBalance(updatedBalance, accountNumber);
				System.out.println("Amount withdrawn, Balance: " + (balance - amount));
			} else {
				throw new InsufficientBalanceException("Indufficient Balance");
			}
			return ;
 		}
		throw new InvalidCredentialsException("Invalid user credentials");
	}
	
	public void withdraw(String accountNumber, double amount, String remark) {
		try {
			withdraw(accountNumber, amount);			
			System.out.println("Remark: " + remark);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
