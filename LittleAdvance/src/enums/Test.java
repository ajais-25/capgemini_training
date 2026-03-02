package enums;

class Test {
	public static void main(String[] args) {
		Status status = Status.COMPLETED;
		switch (status) {
		case NEW:
			System.out.println("Order placed");
			break;

		case IN_PROGRESS:
			System.out.println("Order processing");
			break;
		case COMPLETED:
			System.out.println("Order delivered");
			break;
		}
	}
}