package ArrayLargest;

public class ArrayLargest12345 {
public static void main(String[] args) {
	int t [] = {150,250,350,450};
	int r = t[0];
	for(int i:t) {
		if(i>r) {
			r = i;
			}
	}
	System.out.println("gretaer value is -:"+r);
}
}
