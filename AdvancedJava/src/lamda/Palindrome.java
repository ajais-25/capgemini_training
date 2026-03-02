package lamda;

interface Equal {
	boolean isEqual(int a, int b);
}

public class Palindrome {

	public static void main(String[] args) {
		Equal e = (a, b) -> (a == b);
		
		int[] arr = {1, 2, 3, 2, 1};
		int n = arr.length;
		int i = 0, j = n-1;
		
		while(i < j) {
			if(!e.isEqual(arr[i], arr[j])) {
				System.out.println("Not Palindrome");
				return ;
			}
			i++;
			j--;
		}
		
		System.out.println("Palindrome");

	}
}
