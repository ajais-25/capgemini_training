package testing;

public class Test {
	
	int x = 10;
	static int y = 20;
	
	void show1() {
		x++;
		System.out.println(x);
		System.out.println(y);
	}
	
	static void show2() {
		Test t = new Test();
		t.x++;
		System.out.println(t.x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		show2();
		new Test().show1();
	}

}
