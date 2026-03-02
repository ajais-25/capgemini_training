package strings;

public class EmailValidator {

	public static void main(String[] args) {
		String email = "akshatjaiswal2518@gmail.com";
		
		if (isEmailVaid(email)) {
			System.out.println("Valid Email");
		} else {
			System.out.println("Not a Valid Email");
		}

	}
	
	public static boolean isEmailVaid(String email) {
		
		int atIndex = email.indexOf('@');
		
		if(atIndex == -1 || email.lastIndexOf('@') != atIndex // contains 1 @ 
				|| email.endsWith("gmail.com") || email.endsWith("yahoo.com") // check domain
		) {
			System.out.println("Not a valid email");
			return false;
		}
		
		
		
		return true;
	}

}
