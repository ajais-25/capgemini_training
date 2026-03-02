package exception.checked;

public class CustomCheckedExceptionDemo {
	public static void validateAge(int age) throws InvalidAgeException, RandomException {
		if(age < 18) {
			throw new InvalidAgeException("Age must be 18 or above");
		} else if(age >= 18 && age < 21) {
			throw new RandomException("Random Exception");
//			return Permit.SOFT;
		}
//		return Permit.HARD;
		System.out.println("You are good to go!");
	}
	
	public static void main(String[] args) {
		try {
			validateAge(20);
		} catch (InvalidAgeException | RandomException e) {
			System.out.println("Exception Occured: " + e.getMessage());
		}
	}
}
