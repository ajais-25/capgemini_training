package method_overriding;

public class FamilyDriver {

	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		
		p.printStar();
		c.printStar();
	}

}
