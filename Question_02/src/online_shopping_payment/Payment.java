package online_shopping_payment;

import online_shopping_payment.exceptions.InvalidPaymentException;

public abstract class Payment implements PaymentOperations {
	private long transactionId;
	private String name;
	private double amount;
	
	protected Payment(double amount) throws InvalidPaymentException {
		if(amount <= 0) {
			throw new InvalidPaymentException("Payment Failed: Amount must be greater than 0");
		}
		this.amount = amount;
	}
	
	private int otp;
	private String biometric;
	
	public long getTransactionId() {
		return this.transactionId;
	}
	
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getAmount() {
		return this.amount;
	}
	
	public int getOtp() {
		return this.otp;
	}
	
	public void setOtp(int otp) {
		this.otp = otp;
	}
	
	public String getBiometric() {
		return this.biometric;
	}
	
	public void setBiometric(String biometric) {
		this.biometric = biometric;
	}
	
	@Override
	public void processing() {
		System.out.println("Processing....");
	}
}
