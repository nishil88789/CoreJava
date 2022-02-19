package com.rays.CollectionFramework;

import java.util.Vector;

public class Enumeration {

	public static void main(String[] args) {
		
		Vector v = new Vector<>();
		v.add(25);
		v.add(56);
		v.add(34);
		
		java.util.Enumeration e = v.elements();
		
		while (e.hasMoreElements()) {
			Object o = (Object) e.nextElement();
			
			System.out.println(o);
		}
	}
}
