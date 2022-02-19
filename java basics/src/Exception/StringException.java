package com.rays.Exception;

public class StringException {
	public static void main(String[] args) {
		try {
			String s=null;
			System.out.println(s.length());
		}
		catch(Exception e) {
			System.out.println("this is the String exception");
			System.exit(0);
		}
		finally {
			System.out.println("hello i m finally");
		}
	}

}
