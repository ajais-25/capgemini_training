package stack_and_queue;

import java.util.Deque;
import java.util.ArrayDeque;

public class EvaluatePrefix {
	
	public double solve(String str) {
		Deque<Integer> st = new ArrayDeque<>();
		
		for(int i = str.length() - 1; i>=0; i--) {
			char ch = str.charAt(i);
			
			if(ch >= '0' && ch <= '9')
				st.addLast(ch - '0');
			else {
				int a = st.removeLast();
				int b = st.removeLast();
				
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
		String str = "-+2*319";

		System.out.println("Result: " + new EvaluatePrefix().solve(str));
	}

}
