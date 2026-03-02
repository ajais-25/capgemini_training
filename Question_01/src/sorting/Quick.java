package sorting;

public class Quick {
	
	public static int partition(int[] arr, int s, int e) {
		int pivot = arr[s];
		int i = s, j = e;
		
		while(i < j) {
			while(i <= e && arr[i] <= pivot)
				i++;
			while(j >= s && arr[j] > pivot)
				j--;
			
			if(i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		
		int temp = arr[s];
		arr[s] = arr[j];
		arr[j] = temp;
		
		return j;
	}
	
	public static void quickSort(int[] arr, int s, int e) {
		if(s >= e)
			return ;
		
		int p = partition(arr, s, e);
		
		quickSort(arr, s, p-1);
		quickSort(arr, p+1, e);
	}
	
	public static void solve(int[] arr) {
		int s = 0, e = arr.length - 1;
		
		quickSort(arr, s, e);
	}
	
	public static void display(int[] arr) {
		for(int i = 0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
	}
	
	public static void main(String[] args) {
		int[] arr = {5, 4, 3, 2, 1, 6};
		
		solve(arr);

		display(arr);
	}
}
