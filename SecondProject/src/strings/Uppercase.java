package strings;

public class Uppercase {

	public static void main(String[] args) {
		String str = "aBcD@#$123";
		
		System.out.println(str);
		
		StringBuilder ans = new StringBuilder("");
		
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch >= 'a' && ch <= 'z')
				ans.append((char) (ch - 32));
			else if(ch >= 'A' && ch <= 'Z')
				ans.append((char) (ch + 32));
			else
				ans.append(ch);
		}
		
		System.out.println(ans);
	}

}
