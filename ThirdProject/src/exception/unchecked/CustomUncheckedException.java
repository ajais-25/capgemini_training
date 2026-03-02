package exception.unchecked;

public class CustomUncheckedException {
	public static void withdraw(double balance, double amount) {
		if(amount > balance) {
			throw new InsufficientBalanceException("Insufficient Balance");
		}
		System.out.println("Amount withdrawn, Remaining Balance: " + (balance - amount));
	}
	
	public static void main(String[] args) {
		// withdraw(100, 500); // will throw exception and execution flow will stop
		try {
			withdraw(1000, 500); // will throw exception and execution flow will stop
		} catch(InsufficientBalanceException e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}
