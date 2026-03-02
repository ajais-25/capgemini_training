package online_shopping_payment.exceptions;

public class PaymentFailedException extends RuntimeException {
	public PaymentFailedException(String message) {
		super(message);
	}
}
