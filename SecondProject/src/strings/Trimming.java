package strings;

public class Trimming {

	public static void main(String[] args) {
		String str = "    ab cd";
		
		System.out.println(str);
		
		StringBuilder ans = new StringBuilder("");
		
		int index = -1;
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) != ' ') {
				index = i;
				break;
			}
		}
		
		for(int i = index; i<str.length(); i++) {
			ans.append(str.charAt(i));
		}
		
		System.out.println(ans);
	}

}
