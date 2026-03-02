package arrays;

public class Identify {

	public static void main(String[] args) {
		int[][] arr = {{1}, {2}, {3}};	
		
		if(isColumnMatrix(arr)) {
			System.out.println("Column Matrix");
		} else {
			System.out.println("Not Column Matrix");
		}
		
		printArray(arr);
	}
	
	public static boolean isColumnMatrix(int[][] arr) {
		for(int i = 0; i<arr.length; i++) {
			if(arr[i].length != 1)
				return false;
		}
		
		return true;
	}
	
	public static void printArray(int[][] arr) {
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
