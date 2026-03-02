package sorting;

public class Bubble {
	public static void solve(int[] arr) {
		int n = arr.length;
		
		for(int i = 1; i<=n-1; i++) {
			boolean isSwapped = false;
			for(int j = 0; j<n-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					isSwapped = true;
				}
			}
			if(!isSwapped)
				break;
		}
	}
	
	public static void display(int[] arr) {
		for(int i = 0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
	}
	
	public static void main(String[] args) {
		int[] arr = {13, 46, 24, 52, 20, 9};
		
		solve(arr);

		display(arr);
	}
}
