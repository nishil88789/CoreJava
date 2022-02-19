package com.rays.Exception;

public class TryTryCatch1 {
 
	public static void main(String[] args) {
		
		try {
			int c = 8;
			int g = 0;
			double div = c/g;
			System.out.println("div is"+div);
			
		try {
			String s = null;
			System.out.println(s.length());
		}
		catch(Exception e) {
		System.out.println("This is String Exception");
		}
		}
	    catch(ArithmeticException b) {
	    	System.out.println("this is Arithmatic Exception");
	    }
	  
}
}
