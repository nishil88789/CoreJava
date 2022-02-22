package com.rays.InputOutput;

import java.io.File;

public class TestIO {

	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\NISHIL SHARMA\\Desktop\\Git\\CoreJava\\java basics\\src\\Abstract");
		
		//System.out.println(f.exists());
		System.out.println(f.isDirectory());
	    System.out.println(f.canExecute());
	    System.out.println(f.canRead());
	    System.out.println(f.lastModified());
	    System.out.println(f.length());
	}
} 

