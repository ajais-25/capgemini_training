package searching;

import java.util.Scanner;

public class SquareRoot {
	
	public static int solve(int n) {
		for(int i = 1; i*i <= n; i++) {
			if(i * i == n)
				return i;
		}
		
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = sc.nextInt();
		sc.nextLine();
		
		int ans = solve(num);
		
		if(ans == -1)
			System.out.println("Square root doesn't exists");
		
		System.out.println("Answer: " + ans);
	}

}
