package enums;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
//		OrderStatus status = OrderStatus.PLACED;
//		System.out.println(status.getCode());
		
		Scanner sc = new Scanner(System.in);
		
		OrderStatus status;
		
		System.out.println("Enter the order status");
		System.out.println("1. Placed");
		System.out.println("2. Shipped");
		System.out.println("3. Delivered");
		
		byte orderStatus = sc.nextByte();
		sc.nextLine();
		sc.close();
		
		switch (orderStatus) {
		case 1: {
			status = OrderStatus.PLACED;
			break;
		}
		case 2: {
			status = OrderStatus.SHIPPED;
			break;
		}
		case 3: {
			status = OrderStatus.DELIVERED;
			break;
		}
		default:
			status = OrderStatus.PLACED;
		}
		
		
		System.out.println("Order Status: " + status.getCode() + " " + status);
		
//		for (Color c : Color.values()) {
//			System.out.println(c);
//		}
//		
//		System.out.println(Color.RED.ordinal()); // 0
	}

}
