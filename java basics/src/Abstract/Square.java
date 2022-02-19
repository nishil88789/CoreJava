package com.rays.Abstract;

public class Square extends Shape1Abstract {
private int  side =0;
public  Square() {}
public Square (int i) {
	this.side=i;
}
public void area () {
	System.out.println(side*side);
}
}
