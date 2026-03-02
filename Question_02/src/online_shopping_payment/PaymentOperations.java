package online_shopping_payment;

import online_shopping_payment.exceptions.InvalidPaymentException;

public interface PaymentOperations {
	public void payment(int otp) throws InvalidPaymentException;
	
	public void payment(String biometric) throws InvalidPaymentException;
	
	public void processing();
}
