package practice2;

public class Insert {
	
	public static int[] solve(int[] arr, int el) {
		int n = arr.length;
		int[] arr2 = new int[n+1];
		
		int index = 0;
		int i = 0;
		for(i = 0; i<n; i++) {
			if(arr[i] > el) {
				arr2[index++] = el;
				break;
			}
			arr2[index++] = arr[i];
		}
		
		if(i == n) {
			arr2[n] = el;
			return arr2;
		}
		
		while(i < n)
			arr2[index++] = arr[i++];
		
		return arr2;
	}
	
	private static void display(int[] arr) {
		for(int el : arr)
			System.out.print(el + " ");
	}

	public static void main(String[] args) {
		int[] arr = {101, 105, 110, 120, 130};
		int el = 107;
		
		display(solve(arr, el));
	}

}
