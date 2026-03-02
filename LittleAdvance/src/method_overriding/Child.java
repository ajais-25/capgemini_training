package method_overriding;

import java.util.Scanner;

public class Child extends Parent {
	@Override
	public void printStar() {
		System.out.print("Enter star count: ");
		Scanner userInput = new Scanner(System.in);
		
		int starCount = userInput.nextInt();
		userInput.nextLine();
		userInput.close();
		
		for(int i = 1; i<=starCount; i++)
			System.out.print("*");
	}
}
