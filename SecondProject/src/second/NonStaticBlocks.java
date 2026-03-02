package second;

public class NonStaticBlocks {
	int i = 7;
	
	{
		System.out.println("from non static block");
	}
	
	public void nonStaticMethod() {
		System.out.println("from non static method");
	}
	
	public NonStaticBlocks() {
		System.out.println("from constuctor()");
	}
	
	public static void main(String[] args) {
		System.out.println("start of main()");
		NonStaticBlocks obj = new NonStaticBlocks();
		System.out.println("end of main()");
	}
}
