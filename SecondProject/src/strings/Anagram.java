package strings;

public class Anagram {

	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder("listen");
		StringBuilder str2 = new StringBuilder("silent");
		
		if(str1.length() != str2.length()) {
			System.out.println("Not Anagram");
			return ;
		}
		
		int[] freq = new int[26];
		
		for(int i = 0; i<str1.length(); i++)
			freq[str1.charAt(i) - 97]++;
		
		for(int i = 0; i<str2.length(); i++)
			freq[str2.charAt(i) - 97]--;
		
		for(int i = 0; i<26; i++) {
			if(freq[i] != 0) {
				System.out.println("Not Anagram");
			}
		}
		
		System.out.println("Anagram");
		
	}

}
