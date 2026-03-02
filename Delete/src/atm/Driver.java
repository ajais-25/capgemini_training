package atm;

import java.util.Scanner;

public class Driver {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Account acc = new Account(1234);
		int limit = 3;
		int attemptsLeft = limit;
		
		System.out.println("------Start------");
		
		while(attemptsLeft > 0) {
			System.out.println("Enter pin");
			int pin = sc.nextInt();
			
			try {
				acc.checkPin(pin);
				System.out.println("Access Granted");
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				attemptsLeft--;
				System.out.println("Attempts Left: " + attemptsLeft);
			}
		}
		
		System.out.println("------End------");
	}

}
