package method_overriding2;

public class Employee {
	double basePay = 300000;
	
	public double salaryAfterNthMonth(byte durationInMonths) {
		return (basePay / 12) * durationInMonths;
	}
	
	public double monthlySalCal() {
		return basePay / 12;
	}
	
//	public Object test() {
//		return 1;
//	}
}
