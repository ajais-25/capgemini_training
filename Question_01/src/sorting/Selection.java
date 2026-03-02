package sorting;

public class Selection {
	
	public static void solve(int[] arr) {
		int n = arr.length;
		
		for(int i = 0; i<n; i++) {
			int minIndex = i;
			for(int j = i; j<n; j++) {
				if(arr[j] < arr[minIndex])
					minIndex = j;
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
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
