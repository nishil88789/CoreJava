package com.rays.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class Intratorrr {

	public static void main(String[] args) {
		
		ArrayList v = new ArrayList();
		
		v.add("System");
		v.add("Laptop");
		v.add("12345");
		
		Iterator  it = v.iterator();
	
		while (it.hasNext()) {
			Object o = it.next();
			
		
			System.out.println(o);
		}
	}
	}

