package com.rays.Exception;

public class Exception2 {

	public static void main(String[] args) {
		
		String a = "Rays Technologies";
	
	 try{
		System.out.println("name of length"+a.length());
		System.out.println("character at 16th position"+a.charAt(16));
	 }
	 catch(ArithmeticException e) {
		 System.out.println("String is low");
	 }
	 finally {
		 System.out.println("String is big");
	 }
	 
}
	}

