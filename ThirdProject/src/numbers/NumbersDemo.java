package numbers;

import java.math.BigDecimal;

public class NumbersDemo {
	public static void main(String[] args) {
		double a = 0.1;
		double b = 0.2;
		
		System.out.println("Double result: " + (a + b));
		
		BigDecimal bd1 = new BigDecimal("0.1");
		BigDecimal bd2 = new BigDecimal("0.2");
		
		BigDecimal sum = bd1.add(bd2);
		
		System.out.println("BigDecimal results: " + sum);
	}
}
