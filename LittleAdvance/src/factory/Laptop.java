package factory;

public class Laptop {
	private static Laptop laptop;
	
	private Laptop() {}
	
	// access modifier -> public, non-access modifier -> static
	public static Laptop laptopFactory() {
		if(laptop == null) {
			laptop = new Laptop();
		}
		
		return laptop;
	}
}
