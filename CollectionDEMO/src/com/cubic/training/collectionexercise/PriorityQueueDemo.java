package com.cubic.training.collectionexercise;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("abid");
		pq.add("azeem");
		pq.add("lokesh");
		pq.add("brad");
		//pq.add("abid");
		System.out.println("Head element is - "+ pq.element());
		System.out.println("Head element is  - "+ pq.peek());
		
		System.out.println("Iterating");
		for(String s:pq){
			System.out.println(s);
		}
		
		pq.remove();
		pq.poll();
		
		System.out.println("After removing two elements");
		System.out.println("Iterating");
		for(String s:pq){
			System.out.println(s);
		}
		
	}

}
