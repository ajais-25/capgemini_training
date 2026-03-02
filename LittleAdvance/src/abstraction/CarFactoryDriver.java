package abstraction;

import java.util.Scanner;

public class CarFactoryDriver {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Car car = new Car();
		
		System.out.println("Which engine to fit");
		System.out.println("1. Petrol");
		System.out.println("2. Diesel");
		
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
		
		System.out.println("Engine in car: " + car.engine.getClass());
	}

}
