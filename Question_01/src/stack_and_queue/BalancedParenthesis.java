package stack_and_queue;

import java.util.Stack;

public class BalancedParenthesis {
	public boolean isValid(String str) {
		Stack<Character> st = new Stack<>();
		
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch == '(' || ch == '{' || ch == '[') {
				st.push(ch);
			} else if(ch == ')' || ch == '}' || ch == ']'){
				if(st.empty())
					return false;
				
				char top = st.pop();
				
				if((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '['))
					return false;
			} else
				return false;
		}
		
		return st.empty();
	}
	
	public static void main(String[] args) {
		String str = "[{[]}{()}([]{)]";
		
		BalancedParenthesis obj = new BalancedParenthesis();
		
		System.out.println("Result: " + obj.isValid(str));
	}
}
