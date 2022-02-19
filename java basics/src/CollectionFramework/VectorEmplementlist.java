package com.rays.CollectionFramework;

import java.util.Vector;

public class VectorEmplementlist {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add("One");
		v.add("Two");
		v.add("Three");
		
		Integer i = new Integer(4);
		v.add(i);
		
		Integer value = (Integer)v.get(3);
		System.out.println("index#3 value ="+value);
	}
}

