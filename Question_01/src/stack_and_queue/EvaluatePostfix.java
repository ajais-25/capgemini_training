package stack_and_queue;

import java.util.Deque;
import java.util.ArrayDeque;

public class EvaluatePostfix {
	
	public double solve(String str) {
		Deque<Integer> st = new ArrayDeque<>();
		
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch >= '0' && ch <= '9')
				st.addLast(ch - '0');
			else {
				int b = st.removeLast();
				int a = st.removeLast();
				
				switch(ch) {
					case '+': st.addLast(a + b); break;
					case '-': st.addLast(a - b); break;
					case '*': st.addLast(a * b); break;
					case '/': st.addLast(a / b); break;
				}
			}
			
		}
		
		return st.removeLast();
	}

	public static void main(String[] args) {
		String str = "231*+9-";

		System.out.println("Result: " + new EvaluatePostfix().solve(str));
	}

}
