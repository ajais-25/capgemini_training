package wrapper;

public class Demo {

	public static void main(String[] args) {
		byte b = 7;
		System.out.println("b : " + b);
		
		// wrapping / autoboxing
		Byte b1 = b;
		System.out.println("b1: " + b1);
		System.out.println("b1 class : " + b1.getClass());
		
		// unwrapping / unboxing
		byte b2 = b1;
		System.out.println("b2 : " + b2);
		
		// Parsing
		String bStr = "12";
		Byte b3 = new Byte(bStr);
		System.out.println("b3 : " + b3);
		System.out.println("b3 class : " + b3.getClass());
		
		// Parsing using parse method
		byte b4 = Byte.parseByte(bStr);
		System.out.println("b4 : " + b4);
	}

}
