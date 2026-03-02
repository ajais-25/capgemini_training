package object_class.hash_code;

public class Driver {

	public static void main(String[] args) {
		PetAnimal p = new PetAnimal("Tamigo", 1);
		
		System.out.println(p);
		System.out.println(p.hashCode());
	}
}
