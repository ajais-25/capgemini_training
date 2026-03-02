package hospital_billing;

import hospital_billing.exceptions.InvalidBillException;

public class GeneralPatient extends PatientAccount {
	
	public GeneralPatient() {};
	
	public GeneralPatient(long patientId, String name, double billAmount, double discount) throws InvalidBillException {
		this.setPatientId(patientId);
		this.setName(name);
		this.setDiscount(discount);
		this.setBillAmount(billAmount);
	}
	
	@Override
	public void billPatient(double amount) {
		System.out.println("Patient billed for Amount: " + amount);
	}
	
	@Override
	public void billPatient(double amount, Insurance insurance) {
		System.out.println("Patient billed for Amount: " + amount);
		System.out.println("Insurance company: " + insurance.getName());
	}
	@Override
	public double calculateBill() {
		double finalBill = (this.getBillAmount() * this.getDiscount()) / 100.0;
		
		return finalBill;
	}
}
