package practice2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackSort {
	
	public static boolean solve(List<Integer> arr1, List<Integer> arr2, Stack<Integer> st) {
		
		int n = arr1.size();
		
		for(int i = 0; i<n; i++) {
			int el = arr1.get(i);
			
			while(st.size() > 0 && st.peek() <= el)
					arr2.add(st.pop());
			
			st.push(el);
		}
		
		while(st.size() > 0)
			arr2.add(st.pop());
		
		for(int i = 0; i<n-1; i++) {
			if(arr2.get(i) > arr2.get(i+1))
				return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		List<Integer> arr1 = new ArrayList<>();
		
		arr1.add(3);
		arr1.add(1);
		arr1.add(4);
		arr1.add(2);
		
		System.out.println(solve(arr1, new ArrayList<Integer>(), new Stack<>()));

	}

}
