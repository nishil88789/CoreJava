package OOP;

public class TestAutomobile {
public static void main(String[] args) {
	Automobile m = new Automobile();
	System.out.println(Automobile.gear);
	
	m.setcolour("blue");
	System.out.println(m.getcolour());
	
	m.setspeed(40);
	System.out.println(m.getspeed());
	
	m.setmake("Hero");
	System.out.println(m.getmake());
	
	m.brake();
}
}
