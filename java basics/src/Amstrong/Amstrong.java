package Amstrong;

public class Amstrong {
public static void main(String[] args) {
	int k =123;
	int l=k;
	int v=0;
	int w=0;
	System.out.println("arms");
	for(int i=0;k!=0;i++) {
     v= k % 10;
     w+= v*v*v;
     k/=10;
	}
}
}