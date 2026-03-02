package digital_wallet;

import digital_wallet.enums.ADD_MONEY;
import digital_wallet.exceptions.InsufficientFundsException;
import digital_wallet.exceptions.InvalidTransactionException;

public class BasicWallet extends DigitalWallet {
	
	public BasicWallet(long walletId, String owner, int pin) {
		this.setWalletId(walletId);
		this.setOwner(owner);
		this.setPin(pin);
	}
	
	public void addMoney(int pin, double amount, ADD_MONEY m) throws InvalidTransactionException {
		if(amount <= 0) {
			throw new InvalidTransactionException("Amount must be greater than 0");
		}
		
		double currentBalance = this.getBalance(pin);
		
		this.setBalance(pin, currentBalance + amount);
		
		System.out.println("Amount addded via " + m + " Balance: " + (currentBalance + amount));
	}
	
	public void transfer(int pin, double amount) throws InvalidTransactionException {
		if(amount <= 0) {
			throw new InvalidTransactionException("Amount must be greater than 0");
		}
		
		if(amount > 10000) {
			throw new InvalidTransactionException("Basic Wallet transfer limit exceeded (Max 10,000)");
		}
		
		double currentBalance = this.getBalance(pin);
		
		if((currentBalance - amount) < 0) {
			throw new InsufficientFundsException("Insufficient Balance");
		}
		
		this.setBalance(pin, (currentBalance - amount));
		
		System.out.println("Amount: " + amount + " transferred" + ", Balance: " + (currentBalance - amount));
	}
	
	public void transfer(int pin, double amount, String remark) {
		try {
			transfer(pin, amount);
			System.out.println("Remark: " + remark);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
