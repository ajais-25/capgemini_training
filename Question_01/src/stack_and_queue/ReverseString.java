package stack_and_queue;

import java.util.Stack;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Hello World";
		
		Stack<Character> st = new Stack<>();
		
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			st.push(ch);
		}
		
		String temp = "";
		while(!st.empty()) {
			temp += st.peek();
			st.pop();
		}
		
		System.out.println("Reversed String: " + temp);
	}

}
