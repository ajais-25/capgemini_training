package second;

public class blocks {
	
	{
		System.out.println("from non static block()");
	}

	static int i = printer();
	
	public static void main(String[] args) {
		System.out.println("start of main()");
		new blocks();
		System.out.println("end of main()");
	}
	
	static {
		System.out.println("from static block()");
	}
	
	public static int printer() {
		System.out.println("printed by printer");
		
		return 0;
	}

}
