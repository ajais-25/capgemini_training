package practice2;

public class DefectedItem {
	
	public static int defected(char[] arr) {
		int n = arr.length;
		int l = 0, r = n-1;
		
		while(l <= r) {
			int mid = l + (r-l) / 2;
			
			if(arr[mid] == 'F')
				r = mid - 1;
			else
				l = mid + 1;
		}
		
		return (l < n) ? l : -1;
	}
	

	public static void main(String[] args) {
		char[] arr = {'P', 'P', 'P', 'P', 'F', 'F', 'F', 'F', 'F'};
		
		System.out.println(defected(arr));
	}

}
