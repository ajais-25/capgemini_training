package sorting;

import java.util.List;
import java.util.ArrayList;

public class Merge {
	public static void merge(int[] arr, int s, int mid, int e) {
		List<Integer> temp = new ArrayList<>();
		
		int left = s, right = mid+1;
		
		while(left <= mid && right <= e) {
			if(arr[left] <= arr[right])
				temp.add(arr[left++]);
			else
				temp.add(arr[right++]);
		}
		
		while(left <= mid) {
			temp.add(arr[left++]);
		}
		
		while(right <= e) {
			temp.add(arr[right++]);
		}
		
		for(int i = s; i<=e; i++) {
			arr[i] = temp.get(i - s);
		}
	}
	
	public static void mergeSort(int[] arr, int s, int e) {
		if(s >= e)
			return ;
		
		int mid = s + (e - s) / 2;
		
		mergeSort(arr, s, mid);
		mergeSort(arr, mid+1, e);
		merge(arr, s, mid, e);
	}
	
	public static void solve(int[] arr) {
		int s = 0, e = arr.length - 1;
		
		mergeSort(arr, s, e);
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
