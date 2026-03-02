package variable_shadowing;

public class Test {
	int x = 10;
	static int y = 30;
	
	public void show() {
		int x = 20;
		int y = 40;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(this.y);
		System.out.println(Test.y);
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.show();
	}

}
