package sorting;

public class Sort_012 {
	
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static void solve(int[] arr) {
		int low = 0, mid = 0, high = arr.length - 1;
		
		while(mid <= high) {
			if(arr[mid] == 0) {
				swap(arr, low, mid);
				low++;
				mid++;
			} else if(arr[mid] == 1) {
				mid++;
			} else {
				swap(arr, mid, high);
				high--;
			}
		}
	}
	
	public static void display(int[] arr) {
		for(int i = 0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args) {
		int[] arr = {2, 2, 2, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 0, 2, 1, 0};
		
		solve(arr);

		display(arr);
	}

}
