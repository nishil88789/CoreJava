
package com.rays.Exception;

public class ExceptionHandling {
  public static void main(String[] args) {
	

	try {
		int  k =0;
		int  i = 15;
	double div =i/k;
	System.out.println("div is "+div);
	}
	catch (ArithmeticException e) {
		System.err.println();
	e.printStackTrace();
	}

finally{
     

	System.out.println("Rays");
}
  }
}

