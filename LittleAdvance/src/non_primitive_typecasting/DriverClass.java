package non_primitive_typecasting;

import java.util.Scanner;

public class DriverClass {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Car car = new Car();
		
		System.out.println("Which engine to fit");
		System.out.println("1. Petrol");
		System.out.println("2. Diesel");
		System.out.print("Enter your choice: ");
		
		byte userChoice = sc.nextByte();
		sc.nextLine();
		
		Engine engine = null;
		
		switch (userChoice) {
		case 1: {
			PetrolEngine petrolEngine = new PetrolEngine();
			engine = petrolEngine;
			break;
		}
		case 2: {
			DieselEngine dieselEngine = new DieselEngine();
			engine = dieselEngine;
			break;
		}
		default:
			PetrolEngine petrolEngine = new PetrolEngine();
			engine = petrolEngine;
		}
		
		car.engine = engine;
		
//		System.out.println("Engine in car: " + car.engine.getClass());
//		engine.startEngine();
		
		switch (userChoice) {
		case 1: {
			PetrolEngine petrolEngine = (PetrolEngine) engine;
			petrolEngine.startEngine();
			break;
		}
		case 2: {
			DieselEngine dieselEngine = (DieselEngine) engine;
			dieselEngine.startEngine();
			break;
		}
		default:
			PetrolEngine petrolEngine = (PetrolEngine) engine;
			petrolEngine.startEngine();
			break;
		}
	}

}
