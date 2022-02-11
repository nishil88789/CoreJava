package OOP;

public class Triangle extends Shape7feb {
private int base;
private int height;

public Triangle() {}
public Triangle( int b, int h) {
	base =b;
	height = h;
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
public void area  () {
	double area =(double)1/2*base*height;
	System.out.println("Area of Triangle"+area);
}
}
