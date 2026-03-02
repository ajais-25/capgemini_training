package arrays;

import java.lang.reflect.Array;

public class Test {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		boolean[] arr2 = {true, false, true, false};
		char[] arr3 = {'a', 'b', 'c'};
		Object[] arr4 = {1, "123", 'a'};
		
		printArray(arr1);
		printArray(arr2);
		printArray(arr3);
		printArray(arr4);
	}
	
//	Important
	public static void printArray(Object array) {
		if (!array.getClass().isArray()) {
	        System.out.println("Not an array");
	        return;
	    }

	    int length = Array.getLength(array);

	    for (int i = 0; i < length; i++) {
	        System.out.print(Array.get(array, i) + " ");
	    }
	    System.out.println();
	}

}
