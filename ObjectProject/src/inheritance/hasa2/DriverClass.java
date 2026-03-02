package inheritance.hasa2;

public class DriverClass {

	public static void main(String[] args) {
		Engine e = new Engine(); // Engine created
		Car c = new Car(); // Car created
		
		c.engine = e; // fixing car inside engine 
		e.car = c; // fixing engine inside car
		
		System.out.println(e.noOfCylinders);
		System.out.println(e.car.color);
		
		
		c.engine = e;
		
		System.out.println(c.color);
		System.out.println(c.engine.noOfCylinders);
		
		System.out.println("----------------");
		
		System.out.println(c.engine.car);
		System.out.println(c.engine.car.engine);
		System.out.println(c.engine.car.engine.car);
		System.out.println(c.engine.car.engine.car.engine);

	}

}
