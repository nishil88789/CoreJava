package OOP;

public class Rectangle extends Shape7feb {

	private int Len;
	private int wid;
	
	public Rectangle() {}
	public Rectangle(int L,int w) {
    Len =L;
    wid =w;
	}
	public void area () {
		int area = Len*wid;
		System.out.println("area of rectangle"+area);
	}
}
