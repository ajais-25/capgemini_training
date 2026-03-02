package method_overloading;

public class NonStaticDriver {

	public static void main(String[] args) {
		NonStatic nonStatic = new NonStatic();
		
		nonStatic.add();
		nonStatic.add(5, 10);
		nonStatic.add(5.0, 10.0f);
		nonStatic.add(10.0f, 5.0);

	}

}
