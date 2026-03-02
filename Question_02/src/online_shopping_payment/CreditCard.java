package online_shopping_payment;

import online_shopping_payment.exceptions.InvalidPaymentException;
import online_shopping_payment.exceptions.PaymentFailedException;

public class CreditCard extends Payment {
	
	public CreditCard(long transactionid, String name, double amount, String biometric) throws InvalidPaymentException {
		super(amount);
		this.setTransactionId(transactionid);
		this.setName(name);
		this.setBiometric(biometric);
	}
	
	private void validateCreditCardAmount() throws InvalidPaymentException {
		if(this.getAmount() > 50000) {
			throw new InvalidPaymentException("Payment Failed: Credit Card payment must not exceed Rs. 50000");
		}
	}
	
	@Override
	public void payment(int otp) throws InvalidPaymentException {
		processing();
		validateCreditCardAmount();
		
		if(this.getOtp() != otp) {
			throw new PaymentFailedException("Payment Failed: Invalid otp");
		}
		
		System.out.println("Payment successfull, for Amount: " + this.getAmount());
	}
	
	@Override
	public void payment(String biometric) throws InvalidPaymentException {
		processing();
		validateCreditCardAmount();
		
		if(!this.getBiometric().equals(biometric)) {
			throw new PaymentFailedException("Payment Failed: Biometric verification failed");
		}
		
		System.out.println("Payment successfull, for Amount: " + this.getAmount());
	}
}
