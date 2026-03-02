package method_overloading;

public class FamilyDriver {

	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();
		
		parent.printNum(0);
		child.printNum(1);
		child.printNum(1, 2);
	}

}
