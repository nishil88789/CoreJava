package OOP;

public class Circle extends Shape7feb {
 
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	} 
	public void area() {
		double area =Math.PI*radius*radius;
		System.out.println("Area of circle"+area);
	}
}
	
