package hospital_billing;

public interface PatientAccountOperations {
	public void billPatient(double amount);
	
	public void billPatient(double amount, Insurance insurance);
	
	public double calculateBill();
}
