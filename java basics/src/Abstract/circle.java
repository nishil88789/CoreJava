package com.rays.Abstract;

public class circle extends Shape1Abstract {
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
public void area() {
	System.out.println(Math.PI*radius*radius);
}
}
