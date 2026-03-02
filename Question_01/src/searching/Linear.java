package searching;

import java.util.Scanner;

public class Linear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {8, 9, 3, 1, 5};
		
		System.out.println("Enter the key");
		int key = sc.nextInt();
		sc.nextLine();
		
		sc.close();
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == key) {
				System.out.println("Element found at positon: " + i);
				return ;
			}
		}
		
		System.out.println("Element not found");
	}
}
