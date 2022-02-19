package com.trays.CollectionFramework;

import java.util.ArrayDeque;

public class StackFramework {

	public static void main(String[] args) {
		 
		ArrayDeque<String> name = new ArrayDeque<String>();
		name.add("Help");
		name.add("To");
		name.add("Other");
		
		System.out.println(name);
		name.pop();
		System.out.println(name);
	}
}
