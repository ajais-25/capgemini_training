package strings;

public class Question {

	public static void main(String[] args) {
//		System.out.println("Start");
		
		StringBuilder str = new StringBuilder("beautifulb");
		
		System.out.println(str);
		
		int[] freq = new int[26];
		int[] used = new int[26];
		
		for(int i = 0; i<str.length(); i++)
			freq[str.charAt(i) - 97]++;
		
		StringBuilder res = new StringBuilder("");
		
		for(int i = 0; i<str.length(); i++) { 
			char ch = str.charAt(i);
			
			if(freq[ch - 97] > 1) {
				int times = used[ch - 97] + 1;
				StringBuilder temp = new StringBuilder("");				
				temp.append(ch);
				for(int j = 1; j<=times; j++)
					temp.append(ch);
				res.append(temp);
				used[ch - 97]++;
			} else {
				res.append(ch);
			}
		}
		
		System.out.println(res);

	}

	public static void display(int[] arr) {
		for(int i = 0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
