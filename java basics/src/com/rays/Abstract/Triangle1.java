package com.rays.Abstract;

public class Triangle1  extends Shape1Abstract{
 
	private int base;
	private int height;
	
	public Triangle1 () {}
	public Triangle1(int x,int y) {
		base = x;
		height = y;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
    public void area () {
    double area =(double)1/2*base*height;
    System.out.println("Area of Triangle"+area);
    }
}
