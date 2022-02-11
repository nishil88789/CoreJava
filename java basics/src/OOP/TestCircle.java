package OOP;

public class TestCircle {
public static void main(String[] args) {
	
	Circle c = new Circle();
		
	c.setRadius(5);
	System.out.println(c.getRadius());	
	
	c.setBorderwitdth(5);
	System.out.println(c.getBorderwitdth());
	
	c.setColor("Red");
	System.out.println(c.getColor());
}
}
