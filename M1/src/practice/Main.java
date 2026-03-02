package practice;

// Exceptions
class InvalidUsageException extends Exception {
	public InvalidUsageException(String message) {
		super(message);
	}
}

class BillingLimitExceededException extends Exception {
	public BillingLimitExceededException(String message) {
		super(message);
	}
}

// Interfaces

interface CloudOperations {
}


// Abstract Class
abstract class CloudResource implements CloudOperations {
	private long resourceId;
	private String name;
	private double cost;
	
	protected CloudResource(long resourceId) {
		this.resourceId = resourceId;
		this.cost = 0;
	}
	
	public long getResourceId() {
		return this.resourceId;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getCost(long resourceId) {
		if(this.resourceId != resourceId) {
			System.out.println("Invalid Resource Id");
			return -1;
		}
		
		return this.cost;
	}
	
	public void setCost(long resourceId, double cost) {
		if(this.resourceId != resourceId) {
			System.out.println("Invalid Resource Id");
			return ;
		}
		
		this.cost = cost;
	}
}


// Classes

class Compute extends CloudResource {
	public Compute(long resourceId, String name) {
		super(resourceId);
		this.setName(name);
	}
	
	public void bill(double extra) {
		double bill = 5 + extra;
		
		this.setCost(this.getResourceId(), bill);
	}
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
