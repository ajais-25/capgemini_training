package sorting;

public class Insertion {
	public static void solve(int[] arr) {
		int n = arr.length;
		
		for(int i = 1; i<n; i++) {
			int j = i;
			while(j > 0 && arr[j-1] > arr[j]) {
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
				
				j--;
			}
		}
	}
	
	public static void display(int[] arr) {
		for(int i = 0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
	}
	
	public static void main(String[] args) {
		int[] arr = {5, 4, 3, 2, 1};
		
		solve(arr);

		display(arr);
	}
}
