package online_shopping_payment;

import online_shopping_payment.exceptions.InvalidPaymentException;
import online_shopping_payment.exceptions.PaymentFailedException;

public class Upi extends Payment {

	public Upi(long transactionid, String name, double amount, String biometric) throws InvalidPaymentException {
		super(amount);
		this.setTransactionId(transactionid);
		this.setName(name);
		this.setBiometric(biometric);
	}
	
	@Override
	public void payment(int otp) throws InvalidPaymentException {
		processing();
		
		if(this.getOtp() != otp) {
			throw new PaymentFailedException("Invalid otp");
		}
		
		System.out.println("Payment successfull, for Amount: " + this.getAmount());
	}
	
	@Override
	public void payment(String biometric) throws InvalidPaymentException {
		processing();
		
		if(!this.getBiometric().equals(biometric)) {
			throw new PaymentFailedException("Biometric verification failed");
		}
		
		System.out.println("Payment successfull, for Amount: " + this.getAmount());
	}
}
