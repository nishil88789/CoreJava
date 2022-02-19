package com.rays.Exception;

public class Exception1 {
public static void main(String[] args) {
	
	String name = "vijay";
	try {
		System.out.println("lenght of name is"+name.length());
        System.out.println("Character at 7th position"+ name.charAt(6));
	}
	catch(ArithmeticException e) {
		System.out.println("String is small");
	}
	finally {
		System.out.println("bigg");
	}

}
}