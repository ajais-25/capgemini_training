package digital_wallet;

import digital_wallet.exceptions.InvalidBalanceException;
import digital_wallet.exceptions.InvalidCredentialsException;

public abstract class DigitalWallet implements WalletOperations {
	private long walletId;
	private String owner;
	private double balance;
	
	private int pin;
	
	public long getWalletId() {
		return this.walletId;
	}
	
	public void setWalletId(long walletId) {
		this.walletId = walletId;
	}
	
	public String getOwner() {
		return this.owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public double getBalance(int pin) {
		if(this.pin == pin) {
			return this.balance;
		}
		
		throw new InvalidCredentialsException("Invalid user credentials");
	}
	
	public void setBalance(int pin, double balance) {
		if(this.pin == pin) {
			if(balance < 0) {
				throw new InvalidBalanceException("Invalid Balance");
			}
			this.balance = balance;
			return ;
		}
		
		throw new InvalidCredentialsException("Invalid user credentials");
	}
	
	public int getPin() {
		return this.pin;
	}
	
	public void setPin(int pin) {
		this.pin = pin;
	}
}
