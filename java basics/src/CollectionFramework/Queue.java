package com.rays.CollectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class Queue {

	public static void main(String[] args) {
		
		PriorityQueue p = new PriorityQueue<>();
		
		p.add(12);
		p.add(20);
		p.add(30);
		p.add(40);
		
		p.poll();
		System.out.println(p);
		System.out.println(p.poll());
	
	
	Deque d = new ArrayDeque<>();
	d.add(1.2);
	d.add(1.3);
	d.add(67);
	
	d.addFirst(4.5);
	d.addLast(10.2);
	System.out.println(d);
	}
}
