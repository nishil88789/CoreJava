package com.rays.Interface;

public class Person1 {

	protected String fname = null;
	protected String lname = null;
	protected String address = null;
	
	public Person1() {
		System.out.println("person Default");
	}
	
	public Person1(String fname , String lname) {
		this();
		System.out.println("person 2 Parameter");
	}
   public Person1(String fname , String lname , String adress) {
	 this(fname,lname);
	   System.out.println  ("person 3  parameter");
   }
 
   public static void main(String[] args) {
	Person1 p= new Person1("www","sss","xyz");
	System.out.println();

}
}


