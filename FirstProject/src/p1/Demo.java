package p1;

public class Demo {
	
	public int j;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void varargs(int a, double ...d) {
		System.out.println();
	}
	
	public static String whatItIs(char ch) {
		String rtn = null;
		
		if(ch >= 'a' && ch <= 'z') {
			rtn = "LCA";
		} else if(ch >= 'a' && ch <= 'z') {
			rtn = "UCA";
		} else if(ch >= 'a' && ch <= 'z') {
			rtn = "NUM";
		} else {
			rtn = "SC";
		}
		
		return rtn;
	}

}
