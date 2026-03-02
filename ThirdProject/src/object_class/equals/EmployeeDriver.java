package object_class.equals;

public class EmployeeDriver {

	public static void main(String[] args) {
		Employee e1 = new Employee(1);
		Employee e2 = new Employee(1);
		Employee e3 = e1;
		
		System.out.println(e1.equals(e1));
//		System.out.println(e1.equals(null));
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
	}

}
