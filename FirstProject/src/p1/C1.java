package p1;

public class C1 {
	public static void m1() {
		System.out.println("From m1");
	}
	
	private static void privateMethod() {
		System.out.println("From private method");
	}
	
	protected static void protectedMethod() {
		System.out.println("From protected method");
	}
	
	static void defaultMethod() {
		System.out.println("From default method");
	}
}
