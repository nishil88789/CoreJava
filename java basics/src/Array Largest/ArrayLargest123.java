package ArrayLargest;

public class ArrayLargest123 {
public static void main(String[] args) {
	int a[] = {10,20,30,40,50};
	int b = a[0];
	for(int i:a) {
		if(i>b) {
			b = i;
		}
	}
	System.out.println("greater value is -:"+b);
}
}
