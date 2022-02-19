package com.rays.Abstract;

public class Rectangle extends Shape1Abstract{

	
	private int a = 0;
	private int b =0;
	public Rectangle() {}
    public Rectangle(int i,int j) {
    	this.a=i;
    	this.b=j;
    	
    }
    public void area() {
		System.out.print(a*b);
    }
}

