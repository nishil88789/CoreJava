package com.rays.Exception;

public class ExceptionHandling2 {

	public static void main(String[] args) {
	
		try {
			int a = 18;
			int b = 0;
			double div = a/b;
			System.out.println("div is"+div);
		}
		catch(ArithmeticException f) {
			System.out.println();
			f.printStackTrace();
		}
		finally {
		
			System.out.println("Technologies");
		}
	}
}
