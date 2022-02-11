package OOP;

public class TestTriangle {
public static void main(String[] args) {
	Triangle t = new Triangle(20,30);
	
	t.area();
    t.setBorderwitdth(6);
    t.setColor("black");
    System.out.println(t.getBorderwitdth());
    System.out.println(t.getColor());
    System.out.println(t.getHeight());
    System.out.println(t.getBase());
}
}
