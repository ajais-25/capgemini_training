package firstProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
	static Scanner sc = new Scanner(System.in);
	
	public static ArrayList inputs() {

		ArrayList<Double> arr = new ArrayList<>();
		
		int count = 1;
		
		System.out.println("Enter operand " + count);
		Double op1 = sc.nextDouble();
		sc.nextLine();
		
		arr.add(op1);
		
		System.out.println("Enter operator");
		char opr = sc.next().charAt(0);
		
		System.out.println("Enter operand 2");
		expression.op2 = sc.nextDouble();
		sc.nextLine();
		
		return expression;
	}
	
	public static void toContinue() {	
		System.out.println("To continue enter 'y'?");
		char selection = sc.next().charAt(0);
		
		if(selection != 'y') {
			System.out.println("------Exited------");
			System.exit(0);
		}
	}
	
	static double add(double op1, double op2) {
		return op1 + op2;
	}
	
	static double sub(double op1, double op2) {
		return op1 - op2;
	}
	
	static double mul(double op1, double op2) {
		return op1 * op2;
	}
	
	static double div(double op1, double op2) {
		return op1 / op2;
	}

	public static void main(String[] args) {
		do {
			Expression expression = inputs();
			
			double res = 0;
			switch(expression.opr) {
			case '+':
				res = add(expression.op1, expression.op2);
				break;
			case '-':
				res = sub(expression.op1, expression.op2);
				break;
			case '*':
				res = mul(expression.op1, expression.op2);
				break;
			case '/':
				res = div(expression.op1, expression.op2);
				break;
			default: 
				System.out.println("Invalid operator");
				break;
			}
			
			System.out.println(res);
			toContinue();
		} while(true);
		
	}

}