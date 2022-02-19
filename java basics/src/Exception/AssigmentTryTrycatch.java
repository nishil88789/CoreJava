package com.rays.Exception;

public class AssigmentTryTrycatch {
 public static void main(String[] args) {
	try {
		int a = 6;
		int b = 3;
		 
		double div = a/b;
		System.out.println("div is "+div);
	try {
		String s=null;
		System.out.println(s.length());
	}
	catch(Exception e) {
		System.out.println("this is the String exception");
	}
	}
		catch (ArithmeticException b) {
		System.out.println("this is Arithmetic exception");
		}
}
 }

