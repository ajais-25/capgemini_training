package jcf;

import java.util.PriorityQueue;

public class PQ {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.offer(1);
		System.out.println(pq);
		pq.offer(5);
		System.out.println(pq);
		pq.offer(3);
		System.out.println(pq);
		pq.offer(4);
		System.out.println(pq);
		pq.offer(2);
		System.out.println(pq);

		
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
	}

}
