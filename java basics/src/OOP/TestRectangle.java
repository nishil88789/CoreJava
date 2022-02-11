package OOP;

public class TestRectangle {
public static void main(String[] args) {
	
	Rectangle r = new Rectangle(10,20);
	
	r.area();
	r.setColor("Blue");
	r.setBorderwitdth(4);
	System.out.println(r.getColor());
	System.out.println(r.getBorderwitdth());
}
}
