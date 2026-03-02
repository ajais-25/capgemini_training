package instagram;

public class Driver {

	public static void main(String[] args) {
		Platform p = new Platform();
		
		p.addUser(0, "Alexander");
		p.addUser(1, "Isabella");
		p.addUser(2, "Emma");
		System.out.println();
		
		p.follow(1, 0);
		System.out.println();
		
		p.post(0, "Hiking in mountains");
		System.out.println();

		p.follow(2, 0);
		System.out.println();
		
		p.post(0, "Enjoying a beautiful day");
		System.out.println();
		
		p.unfollow(1, 0);
		System.out.println();
		
	}

}
