package jcf;

import java.util.ArrayDeque;

public class DQ {

	public static void main(String[] args) {
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		
		dq.addLast(5);
		dq.addLast(3);
		dq.addLast(2);
		dq.addLast(4);
		dq.addLast(1);
		
		System.out.println(dq);

	}

}
