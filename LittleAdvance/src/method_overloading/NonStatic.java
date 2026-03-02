package method_overloading;

public class NonStatic {
	public void add() {
		System.out.println("In add 1");
	}
	
	public void add(int a, int b) {
		System.out.println("In add 2");
	}
	
	public void add(double a, float b) {
		System.out.println("In add 3");
	}
	
	public void add(float a, double b) {
		System.out.println("In add 4");
	}
	
}
