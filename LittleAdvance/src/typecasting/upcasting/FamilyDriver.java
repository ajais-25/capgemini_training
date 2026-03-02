package typecasting.upcasting;

public class FamilyDriver {

	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.p);
		p.pm();
		
//		System.out.println(p.c);
//		p.cm();
		
		Child c = new Child();
		System.out.println(c.c);
		c.cm();
		System.out.println(c.p);
		c.pm();
		
//		upcasting
		Child c1 = new Child();
		Parent p1 = c1; // 'p1' upcasted variable --> cannot access child members
		System.out.println(p1.p);
		p1.pm();
	}

}
