package method_overriding2;

public class CompanyDriver {

	public static void main(String[] args) {
		Employee e = new Employee();
		It it = new It();
		Supporting sup = new Supporting();
		
		System.out.println(e.monthlySalCal());
		System.out.println(it.monthlySalCal());
		System.out.println(sup.monthlySalCal());
		
		System.out.println(e.salaryAfterNthMonth((byte) 3));
		System.out.println(it.salaryAfterNthMonth((byte) 6, 10000));
		System.out.println(sup.salaryAfterNthMonth((byte) 9, 5000));
	}

}
