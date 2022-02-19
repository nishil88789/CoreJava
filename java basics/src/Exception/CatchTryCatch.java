package com.rays.Exception;

public class CatchTryCatch {
public static void main(String[] args) {
	int k =5;
	int h = 0;
	 try{double div = k/h;
	 System.out.println("div is "+div);
	 }
	 catch(ArithmeticException e) {
		 System.out.println("Hello I am Arithmetic Exception");
	 }
	 finally {     System.out.println("hello");
	    
	 try{String s = "Hello Rays";
		System.out.println(s.charAt(25));
		}
		catch(StringIndexOutOfBoundsException r) {
			System.out.println("Hello i am StringIndexOutOfBoundsException");
		}
	 }
	 
	 
}
}
