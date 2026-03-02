package digital_wallet.exceptions;

public class InvalidBalanceException extends RuntimeException {
	public InvalidBalanceException(String message) {
		super(message);
	}
}
