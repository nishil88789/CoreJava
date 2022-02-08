package OOP;

public class Automobile {
private String colour = null;
private int speed = 0;
private String make = null;
public static final int gear = 5;
public String getcolour() {
	return colour;
}
public void setcolour(String colour) {
	this.colour=colour;
}
public int getspeed() {
	return speed;
}
public void setspeed(int speed) {
	this.speed=speed;
}
public String getmake() {
	return make;
}
public void setmake(String make) {
	this.make = make;
}
public void brake() {
	System.out.println("stop");
}
}
