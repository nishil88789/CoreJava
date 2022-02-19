package com.rays.Exception;

public class StringException1 {

	public static void main(String[] args) {
		try {
			String d = null;
			System.out.println(d.length());
		}
		catch (Exception e) {
			System.out.println("This is String Exception");
			System.exit(0);
		}
		finally {System.out.println("finally");
	}
	}
}