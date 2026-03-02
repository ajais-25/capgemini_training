package inheritance.isa;

public class FamilyDriver {

	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = new Parent();
		
		System.out.println("child var a: " + child.a);
		System.out.println("child var b: " + child.b);
		System.out.println("parent var a: " + parent.a);
	}

}
