package firstProject;

import java.util.Scanner;

public class NewCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello");
		
		int sum = 0;
		
		System.out.println("Enter operand 1");
		
		double op1 = sc.nextDouble();
		sum += op1;
		
		System.out.println("Enter operator");
		char opr = sc.next().charAt(0);
		
		if(opr != '+') {
			System.out.println("Invalid operator");
			System.exit(0);
		}
		
		int count = 2;
		do {
			System.out.println("Enter operand " + count + " or enter '-999' to get result");
			double op = sc.nextDouble();
			
			if(op == -999) {
				System.out.println("Result: " + sum);
				break;
			}
			
			count++;
			sum += op;
		} while(true);
	}
}
