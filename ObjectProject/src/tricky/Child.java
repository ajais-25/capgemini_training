package tricky;

public class Child {
	static int b = 1;

	int abcdef = 1;
	static int ijkl = 2;
	static final int mnop = 3;
	
	public static void main(String[] args) {
		Parent.a = 100;
		System.out.println(Parent.a);
	}
}
