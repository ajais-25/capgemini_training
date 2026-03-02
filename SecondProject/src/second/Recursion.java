package second;

public class Recursion {
	public static void main(String[] args) {
		starPrinter(5);
	}
	
	public static void starPrinter(int count) {
		if(count > 0) {
			System.out.println("*");
			starPrinter(--count);
		}
		
		return ;
	}
}
