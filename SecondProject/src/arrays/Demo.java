package arrays;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
//		System.out.println("start");
//		Object[] arr = new Object[5];
//		arr[0] = true;
//		arr[1] = (byte) 1;
//		arr[2] = 'a';
//		arr[3] = "Hello";
//		arr[4] = 1234567890L;			
//		
//		for(int i = 0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		
//		System.out.println("end");
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println("Enter number: ");
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		sc.close();
	}

}
