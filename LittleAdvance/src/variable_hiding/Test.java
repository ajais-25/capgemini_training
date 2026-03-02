package variable_hiding;

public class Test {

	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		System.out.println(p.x);
		System.out.println(c.x);
	}

}
