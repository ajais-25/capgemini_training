package food_delivery;


// Exceptions




// Abstraction

abstract class OrderPayment {
	private int orderId;
	private String name;
	private double billAmount;
	private double discount;
	
	public int getOrderId() {
		return this.orderId;
	}
	
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public double getBillAmount() {
		return this.billAmount;
	}
}



// Child Classes

















public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
