package queue;

import java.util.*;

/*
 * @author denis 3/6/2020
 */


public class Queue1 {
	
	public static void main(String [] args) {
		
		PriorityQueue<String> q = new PriorityQueue<String>();
		
		q.offer("first");
		q.offer("second");
		q.offer("third");
		
		//print all elements
		System.out.printf("%s", q);
		System.out.println();
		
		//print element with highest priority
		System.out.printf("%s", q.peek());
		System.out.println();
		
		//remove element element with highest priority
		q.poll();
		System.out.printf("%s", q);
	}

}
