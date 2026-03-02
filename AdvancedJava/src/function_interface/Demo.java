package function_interface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Demo {

	public static void main(String[] args) {
		Function<Integer, Double> f = (n) -> Math.sqrt(n);
				
		System.out.println(f.apply(4));
		
		Function<Integer, Double> f2 = Math::sqrt;
		
		System.out.println(f2.apply(16));
		
		BiFunction<Integer, Integer, Integer> f3 = (a, b) -> Demo.add(a, b);
		
		System.out.println(f3.apply(5, 10));
		
		BiFunction<Integer, Integer, Integer> f4 = Demo::add;
		
		System.out.println(f4.apply(10, 10));
		
		Demo d = new Demo();
		
		BiFunction<Integer, Integer, Integer> f5 = (a, b) -> d.mul(a, b);
		
		System.out.println(f5.apply(3, 4));
		
		BiFunction<Integer, Integer, Integer> f6 = d::mul;
		
		System.out.println(f6.apply(3, 4));
	}
	
	public static int add(int a, int b) {
		return a + b;
	}

	public int mul(int a, int b) { 
		return a * b;
	}
	
}
