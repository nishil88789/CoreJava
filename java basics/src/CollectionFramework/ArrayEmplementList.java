package com.rays.CollectionFramework;

import java.util.ArrayList;

public class ArrayEmplementList {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		
		a.add("Rays");
		a.add("Technologies");
	    a.add("Indore");
	
	    int size = a.size();
	    
	    for(int i = 0; i<size; i++) {
	    	
	    	System.out.println(i+";"+a.get(i));
	    	
	    }
	}
}
