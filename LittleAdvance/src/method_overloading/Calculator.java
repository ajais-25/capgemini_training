package method_overloading;

public class Calculator {
	public static void addition() {
		// base1
	}
	
	public static void addition(double a, double b) {
		// no of arguments wrt to base1
		// base2
	}
	
	public static void addition(float a, double b) {
		// datatype of arguments wrt base2
		// base3
	}
	
	public static void addition(double a, float b) {
		// change in order of datatypes of arguments wrt base 3
		// base4
	}
}
