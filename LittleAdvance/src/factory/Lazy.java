package factory;

public class Lazy {
	private static Lazy lazy;
	
	private Lazy() {}
	
	public static Lazy lazyFactory() {
		if(lazy == null) {
			lazy = new Lazy();
		}
		
		return lazy;
	}
}