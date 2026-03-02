package method_overriding2;

public class It extends Employee {
	double varPay = 200000;
	
	public double salaryAfterNthMonth(byte durationInMonths, double bonus) {
		return (((basePay + varPay) / 12) * durationInMonths) + bonus;
	}
	
	@Override
	public double monthlySalCal() {
		return (basePay + varPay) / 12;
	}
	
//	@Override
//	public String test() {
//		return "ddd";
//	}
}
