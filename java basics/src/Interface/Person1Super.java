package com.rays.Interface;

public class Person1Super extends Person1 {
	
	
	public Person1Super () {
		System.out.println("Default Constructor");
	}
    
	public Person1Super(String fn, String ln) {
		System.out.println("2 parameter");
	}
	public Person1Super(String fn, String ln, String dest) {
	super(fn ,ln);
		System.out.println("3 parameter ");
	}
}
