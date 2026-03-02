package objects;

public class UserDriver {

	public static void main(String[] args) {
		User user1 = new User("email@gmail.com", "123456");
		
		System.out.println(user1.email);
		System.out.println(user1.password);
		System.out.println(user1.address);
		
		System.out.println("--------------");

		User user2 = new User("email@gmail.com", "123456", "address");
		
		System.out.println(user2.email);
		System.out.println(user2.password);
		System.out.println(user2.address);
	}

}
