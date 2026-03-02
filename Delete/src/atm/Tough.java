package atm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tough {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		List<Integer> st = new ArrayList<>();
		Account acc = new Account(1234);
		int limit = 3;
		
		System.out.println("------Start------");
		
		while(st.size() < limit) {
			System.out.println("Enter pin");
			int pin = sc.nextInt();
			
			try {
				acc.checkPin(pin);
				System.out.println("Access Granted");
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				st.add(-1);
				System.out.println("Attempts Left: " + (limit - st.size()));
			}
		}
		
		System.out.println("------End------");
	}

}
