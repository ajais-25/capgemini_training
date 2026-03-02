package arrays;

import java.util.Scanner;

public class VarArgsCalc {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		

	}
	
	public static int add(int ...nums) {
		int sum = 0;
		
		for(int i : nums) {
			sum += i;
		}
		
		return sum;
	}

}
