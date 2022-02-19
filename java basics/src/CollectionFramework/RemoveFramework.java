package com.trays.CollectionFramework;

import java.util.LinkedList;

public class RemoveFramework {

	public static void main(String[] args) {
		
		LinkedList<String> name = new LinkedList<String>();
		
		name.add("Computer");
		name.add("Laptop");
		name.add("System");
		
		System.out.println(name);
		name.removeLast();
		System.out.println(name);
	}
}
