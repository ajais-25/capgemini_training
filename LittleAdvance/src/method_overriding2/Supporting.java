package method_overriding2;

public class Supporting extends Employee {
	double varPay = 100000;
	
	public double salaryAfterNthMonth(byte durationInMonths, double bonus) {
		return (((basePay + varPay) / 12) * durationInMonths) + bonus;
	}
	
	@Override
	public double monthlySalCal() {
		return (basePay + varPay) / 12;
	}
}
