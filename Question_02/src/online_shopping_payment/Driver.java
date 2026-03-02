package online_shopping_payment;

import java.util.Scanner;

public class Driver {
	static Scanner sc = new Scanner(System.in);

	private long generateTransactionId() {
		return (long) (Math.random() * 1000000);
	}

	private int generateOtp() {
		return (int) (Math.random() * 10000);
	}

	public static void main(String[] args) {
		Driver d = new Driver();

		Payment payment = null;

		System.out.println("Enter you name");

		String name = sc.nextLine();

		System.out.println("Enter the amount to be paid");

		double amount = sc.nextDouble();
		sc.nextLine();

		System.out.println("Enter you mode of payment");
		System.out.println("1. Credit Card");
		System.out.println("2. UPI");
		System.out.println("Any other 'exit'");
		System.out.println("Enter your choice");

		byte paymentMode = sc.nextByte();
		sc.nextLine();

		String biometric = "bio"; // just for demo

		try {
			switch (paymentMode) {
			case 1: {
				payment = new CreditCard(d.generateTransactionId(), name, amount, biometric);

				break;
			}
			case 2: {
				payment = new Upi(d.generateTransactionId(), name, amount, biometric);

				break;
			}
			default: {
				System.out.println("Exit requested");
				System.out.println("-----Exited-----");
				return ;
			}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		if (payment == null) {
			System.out.println("Payment initialization failed");
			return;
		}

		try {
			System.out.println("Enter you choice of verification");
			System.out.println("1. OTP");
			System.out.println("2. Biometric");
			System.out.println("Enter your choice");

			byte choice = sc.nextByte();
			sc.nextLine();

			switch (choice) {
			case 1: {
				int otp = d.generateOtp();

				payment.setOtp(otp);

				System.out.println("Otp sent: " + otp);

				System.out.println("Enter otp");

				int otpInput = sc.nextInt();
				sc.nextLine();

				payment.payment(otpInput);

				break;
			}
			case 2: {
				System.out.println("Enter biometric");

				String bioInput = sc.next();

				payment.payment(bioInput);

				break;
			}
			default: {
				System.out.println("Invalid choice");
				System.out.println("Choose again");
				break;
			}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Transaction Attempt completed");
			sc.close();
		}

	}

}
