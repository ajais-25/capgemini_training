package lamda;

interface Demo {
	int mod(int a, int b);
}

public class Prime {

	public static void main(String[] args) {
		int n = 7;
		
		Demo d = (a, b) -> a % b;
		
		for(int i = 2; i<n/2; i++) {
			if(d.mod(n, i) == 0) {
				System.out.println("Not Prime");
				return ;
			}
		}
		
		System.out.println("Prime");
	}

}
