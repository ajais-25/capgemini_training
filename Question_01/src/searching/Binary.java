package searching;

import java.util.Scanner;

public class Binary {
	
	public int solve(int[] arr, int key) {
		int s = 0, e = arr.length - 1;
		
		while(s <= e) {
			int mid = s + (e-s)/2;
			
			if(arr[mid] == key)
				return mid;
			else if(arr[mid] > key)
				e = mid - 1;
			else
				s = mid + 1;
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println("Enter the key");
		int key = sc.nextInt();
		sc.nextLine();

		int ans = new Binary().solve(arr, key);
		
		if(ans == -1) {
			System.out.println("Element not found");
			return ;
		}
		
		System.out.println("Element found at positon: " + ans);
	}
}
