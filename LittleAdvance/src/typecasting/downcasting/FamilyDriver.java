package typecasting.downcasting;

public class FamilyDriver {

	public static void main(String[] args) {
//		Parent p = new Parent();
//		Child c = (Child) p; // give classCastException
		
		System.out.println("start");
		Child c = new Child();
		
		Parent upcastedVar = c;
		Child downcastedVar = (Child) c;
		
		System.out.println(downcastedVar.p);
		downcastedVar.pm();
		System.out.println(downcastedVar.c);
		downcastedVar.cm();
		
		System.out.println("end");
	}

}
