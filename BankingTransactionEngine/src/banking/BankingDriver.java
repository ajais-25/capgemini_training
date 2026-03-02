package banking;

import java.util.Scanner;

import banking.enums.Deposit;
import banking.exceptions.InvalidAmountException;

public class BankingDriver {
	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter your name");
		String name = userInput.nextLine();

		System.out.println();
		System.out.println("Which account you want to create?");
		System.out.println("1. Savings Account");
		System.out.println("2. Current Account");
		System.out.println("Choose your account");

		byte accountType = userInput.nextByte();
		userInput.nextLine();

		BankAccount account;

		String accountNumber = "1";

		switch (accountType) {
		case 1: {
			account = new SavingsAccount(accountNumber, name);
			break;
		}
		case 2: {
			account = new CurrentAccount(accountNumber, name);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + accountType);
		}

		do {
			try {
				System.out.println("Enter the operation you want to perform");
				System.out.println("1. Deposit");
				System.out.println("2. Withdraw");
				System.out.println("Any other to 'exit'");

				byte action = userInput.nextByte();
				userInput.nextLine();

				switch (action) {
				case 1: {
					System.out.println("Enter the amount to deposit");
					double amount = userInput.nextDouble();
					userInput.nextLine();

					if (amount <= 0) {
						throw new InvalidAmountException("Amount should be greater than 0");
					}

					Deposit d;
					System.out.println("Enter deposit type");
					System.out.println("1. Cash");
					System.out.println("2. Online");
					System.out.println("Enter your choice");

					byte depositType = userInput.nextByte();
					userInput.nextLine();

					switch (depositType) {
					case 1: {
						d = Deposit.CASH;
						break;
					}
					case 2: {
						d = Deposit.ONLINE;
						break;
					}
					default:
						throw new IllegalArgumentException("Unexpected value: " + depositType);
					}

					account.deposit(accountNumber, amount, d);

					break;
				}
				case 2: {
					System.out.println("Enter the amount to withdraw");
					double amount = userInput.nextDouble();
					userInput.nextLine();

					if (amount <= 0) {
						throw new InvalidAmountException("Amount should be greater than 0");
					}

					account.withdraw(accountNumber, amount);

					break;
				}
				default:
					System.exit(0);
				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);
	}
}
