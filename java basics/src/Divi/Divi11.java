package Divi;

public class Divi11 {
public static void main(String[] args) {
	int a = 0;
	int b = 0;
	int c;
	for(int i=100;i<=200;i++) {
		if(i % 7==0) {
			a = a + i ;
			b++;
			System.out.println(i);
		}
		}
	c=a/b;
	System.out.println("Sum of all division no. by 7-:"+a);
	System.out.println("Sum of all division no. by 7-:"+b);
}
}
