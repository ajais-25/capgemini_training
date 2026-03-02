package lamda;

@FunctionalInterface
interface Draw {
	void circle();
}

//class C1 implements Draw {
//	@Override
//	public void circle() {
//		System.out.println("C1 Draw");
//		
//	}
//}
//
//class C2 implements Draw {
//	@Override
//	public void circle() {
//		System.out.println("C2 Draw");
//		
//	}
//}
//
//class C3 implements Draw {
//	@Override
//	public void circle() {
//		System.out.println("C2 Draw");
//		
//	}
//}

interface Summation {
	int sum(int a, int b);
}

interface Subtraction {
	int sub(int a, int b);	
}

interface Multiplication {
	int mul(int a, int b);	
}

interface Division {
	double div(double a, double b);	
}


public class Launch {
	public static void main(String[] args) {
//		Draw d1 = () -> System.out.println("C1 Draw");
//		Draw d2 = () -> System.out.println("C2 Draw");
//		Draw d3 = () -> System.out.println("C3 Draw");
//		
//		d1.circle();
//		d2.circle();
//		d3.circle();
		
		Summation sum = (a, b) -> a + b;
		Subtraction sub = (a, b) -> a - b;
		Multiplication mul = (a, b) -> a * b;
		Division div = (a, b) -> a / b;
		
		System.out.println(sum.sum(5, 10));
		System.out.println(sub.sub(5, 10));
		System.out.println(mul.mul(5, 10));
		System.out.println(div.div(5, 10));
	}

}
