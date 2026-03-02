package hospital_billing;

import hospital_billing.exceptions.InvalidBillException;

public abstract class PatientAccount implements PatientAccountOperations {
	private long patientId;
	private String name;
	private double billAmount;
	
	private double discount;
	
	public long getPatientId() {
		return this.patientId;
	}
	
	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getDiscount() {
		return this.discount;
	}
	
	public void setDiscount(double discount) throws InvalidBillException {
		if(discount <= 0) {
			throw new InvalidBillException("Discount must be greater than 0"); 			
		}
		this.discount = discount;
	}
	
	public double getBillAmount() {
		return this.billAmount;
	}
	
	protected void setBillAmount(double billAmount) throws InvalidBillException {
		if(billAmount <= 0) {
			throw new InvalidBillException("Bill amount must be greater than 0"); 
		}
		
		double finalBill = this.calculateBill();
		this.billAmount = finalBill;
	}
}
