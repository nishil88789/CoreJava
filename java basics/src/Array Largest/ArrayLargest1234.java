package ArrayLargest;

public class ArrayLargest1234 {
public static void main(String[] args) {
	int d[] = {100,200,300,400,500,600,700};
	int e =d[0];
	for(int i:d) {
		if(i>e) {
			e= i;
		}
	}
	System.out.println("greater num is -:"+e);
}
}
