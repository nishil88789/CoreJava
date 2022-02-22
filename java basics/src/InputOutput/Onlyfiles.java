package com.rays.InputOutput;

import java.io.File;

public class Onlyfiles {
 public static void main(String[] args) {
	
	 File Directory = new File("C:\\Users\\NISHIL SHARMA\\Desktop\\java");
	 File[] list = Directory.listFiles();
	 
	 for(int i=0;i<list.length;i++) {
		 if(list[i].isFile()) {
			 System.out.println((i+1)+";"+list[i].getName());
		 }
	 }
 }
}