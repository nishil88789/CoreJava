package HarmonicSeries;

public class Harmonic12 {
public static void main(String[] args) {
	 int n = 20;
	double r =0.0;
	System.out.println("Harmonic series is :");
	while(n>0) {
		r = r+(double)1/n;
		n--;
		
		System.out.println("Result is :"+r);
	}
	
}
}
