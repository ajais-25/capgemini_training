package encapsulation;

public class HulkuKaAccount {

	private double balance = 6000;
	private short pin = 6598;
	
	public double getBalance(short pin) {
		if(this.pin == pin) {
			return this.balance;
		}
		return -1;
	}
	
	public void setBalanceCredit(double amt) {
		this.balance += amt;
	}
	
	public void setBalanceDebit(double amt) {
		this.balance -= amt;
	}

}
