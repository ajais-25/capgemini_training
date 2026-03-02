package arrays;

import java.util.Scanner;

public class MulArray {

	public static void main(String[] args) {
//		int[][] arr1 =  new int[3][5];
		
//		jagged array
//		int[][] arr2 =  {{1, 2}, {1}, {1, 2, 3, 4}};
		
//		System.out.println(arr);
		
//		System.out.println(getTotalElements(arr1));
//		System.out.println(getTotalElements(arr2));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of rows");
		int m = sc.nextInt();
		System.out.println("Enter the no of columns");
		int n = sc.nextInt();
		
		int[][] arr = new int[m][n];
		
		System.out.println("Enter array elements");
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Printing the array:-");
		
		printArray(arr);
		
		sc.close();
	}
	
	public static void printArray(int[][] arr) {
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
