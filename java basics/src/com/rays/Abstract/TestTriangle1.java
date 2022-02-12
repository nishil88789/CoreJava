package com.rays.Abstract;

public class TestTriangle1 {
public static void main(String[] args) {
	Triangle1 t = new Triangle1(30,40);
	
	t.area();
	t.setBorderwidth(6);
	t.setColour("Black");
	System.out.println(t.getBorderwidth());
	System.out.println(t.getColour());
	System.out.println(t.getBase());
	System.out.println(t.getHeight());
		
}
}
