package hospital_billing.exceptions;

public class PaymentNotAllowedException extends RuntimeException {
	public PaymentNotAllowedException(String message) {
		super(message);
	}
}
