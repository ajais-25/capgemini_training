package factory;

public class Driver {

	public static void main(String[] args) {
		Laptop l1 = Laptop.laptopFactory();
		Laptop l2 = Laptop.laptopFactory();
		
		System.out.println(l1);
		System.out.println(l2);
	}

}
