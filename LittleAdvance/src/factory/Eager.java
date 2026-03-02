package factory;

public class Eager {
	private static Eager eager = new Eager();
	
	private Eager() {}
	
	public static Eager eagerFactory() {
		return eager;
	}
}
