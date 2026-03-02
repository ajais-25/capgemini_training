package arrays;

public class Question {

	public static void main(String[] args) {
		int[][] arr1 = new int[3][3];
		
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		arr1[0][2] = 3;
		
		arr1[1][0] = 4;
		arr1[1][1] = 0;
		arr1[1][2] = 5;
		
		arr1[2][0] = 6;
		arr1[2][1] = 7;
		arr1[2][2] = 8;
		
		System.out.println("Before");
		
		printArray(arr1);
		
		int rows = arr1.length;
		int cols = arr1[0].length;
		
		int[] zeros = new int[rows * cols];
		
		markZeros(arr1, zeros, cols);
		
		for(int i = 0; i<zeros.length; i++) {
			if(zeros[i] == 1) {
				int r = i / cols;
				int c = i % cols;
				makeRowAndColZero(arr1, r, c, rows, cols);
			}
		}
		
		System.out.println("After");
		
		printArray(arr1);
	}
	
	public static void makeRowAndColZero(int[][] arr, int r, int c, int rows, int cols) {
		for(int i = 0; i<cols; i++) {
			if(arr[r][i] != 0)
				arr[r][i] = 0;
		}
		
		for(int i = 0; i<rows; i++) {
			if(arr[i][c] != 0)
				arr[i][c] = 0;
		}
	}
	
	public static void markZeros(int[][] arr1, int[] arr2, int cols) {
		for(int i = 0; i<arr1.length; i++) {
			for(int j = 0; j<arr1.length; j++) {
				if(arr1[i][j] == 0) {
					int pos = (i * cols) + j;
					arr2[pos] = 1;
				}
			}
		}
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
