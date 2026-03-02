package comparison;

public class ConcreteClass {
//	static {
//		x = 8;
//	}
//	
//	static final int x;
//	
//	{
//		y = 8;
//	}
//	
//	final int y;
	
	int nonStaticVar = 1;
	static int staticVar = 1;
	static final int staticFinalVar = 1;
	final int nonStaticFinalVar = 1;
	
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE + Integer.MAX_VALUE);
	}
}
