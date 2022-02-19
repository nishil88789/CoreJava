package com.trays.CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Collection {

	public static void main(String[] args) {
		
		
		List list = new ArrayList<>();
	   
		list.add("Rays");
		list.add("16/02/2022");
		list.add("Indore");
		
	System.out.println(list);
		
	 ArrayList al = new ArrayList<>();
	 al.add(2222);
	 al.add("shivam");
	 al.add("Corporate J");
	 al.retainAll(list);
	 
	 System.out.println(list.retainAll(al));
	}
}
