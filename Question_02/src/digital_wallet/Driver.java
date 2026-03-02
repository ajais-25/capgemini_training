package digital_wallet;

import java.util.Scanner;

import digital_wallet.enums.ADD_MONEY;

public class Driver {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		DigitalWallet wallet = new BasicWallet(-1, "xxx", 0000);
		
		System.out.println("Enter owner name");
		
		String owner = sc.nextLine();
		
		System.out.println("Enter the type of wallet you want to create");
		System.out.println("1. Basic Wallet");
		System.out.println("2. Premium Wallet");
		System.out.println("Any other 'exit'");
		System.out.println("Enter your choice");

		byte walletType = sc.nextByte();
		sc.nextLine();
		
		long walletId = 1234567890L;
		
		switch(walletType) {
			case 1: {
				System.out.println("Enter pin");
				
				int pin = sc.nextInt();
				sc.nextLine();
				
				wallet = new BasicWallet(walletId, owner, pin);
				
				break;
			}
			case 2: {
				System.out.println("Enter pin");
				
				int pin = sc.nextInt();
				sc.nextLine();
				
				wallet = new PremiumWallet(walletId, owner, pin);
				
				break;
			}
			default: {
				System.out.println("Invalid wallet type!");
				System.exit(0);
			}
		}
		
		System.out.println("Wallet Created");
		
		do {
			try {
				System.out.println("Enter the action to perform");
				System.out.println("1. Add Money");
				System.out.println("2. Transfer");
				System.out.println("3. Get Balance");
				System.out.println("Any other 'exit'");
				System.out.println("Enter your choice");
				
				byte action = sc.nextByte();
				sc.nextLine();
				
				switch(action) {
					case 1: {
						ADD_MONEY m = ADD_MONEY.UPI;
						
						System.out.println("Add Money via");
						System.out.println("1. UPI");
						System.out.println("2. Card");
						System.out.println("Enter your choice");
						
						byte choice = sc.nextByte();
						sc.nextLine();
						
						switch(choice) {
							case 1: {
								m = ADD_MONEY.UPI;
								
								break;
							}
							case 2: {
								m = ADD_MONEY.CARD;
								
								break;
							}
							default: {
								throw new IllegalArgumentException("Invalid choice, choose action again");
							}
						}
						
						System.out.println("Enter ammount to add");
						
						double amount = sc.nextDouble();
						sc.nextLine();
						
						System.out.println("Enter pin");
						
						int pin = sc.nextInt();
						sc.nextLine();
						
						wallet.addMoney(pin, amount, m);
						
						break;
					}
					case 2: {
						System.out.println("Enter the amount to transfer");
						
						double amount = sc.nextDouble();
						sc.nextLine();
						
						System.out.println("Enter pin");
						
						int pin = sc.nextInt();
						sc.nextLine();
						
						System.out.println("Transfer Money");
						System.out.println("1. Without Remark");
						System.out.println("2. With Remark");
						System.out.println("Enter choice");
						
						byte choice = sc.nextByte();
						sc.nextLine();
						
						switch(choice) {
							case 1: {
								wallet.transfer(pin, amount);
								
								break;
							}
							case 2: {
								System.out.println("Enter remark");
								
								String remark = sc.nextLine();
								
								wallet.transfer(pin, amount, remark);
								
								break;
							}
							default: {
								System.out.println("Invalid choice, enter action again");
								break;
							}
						}
						
						break;
					}
					case 3: {
						System.out.println("Enter pin");
						
						int pin = sc.nextInt();
						
						System.out.println("Balance: " + wallet.getBalance(pin));
						
						break;
					}
					default: {
						System.exit(0);
					}
				}
			} catch(Exception e) {
				System.out.println(e.getMessage());
			} finally {
				System.out.println("Transaction attempt completed");
			}
		} while(true);
	}
}
