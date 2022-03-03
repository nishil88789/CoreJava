package ExerciseExceptionHandling;

public class Question6 {
	public static void main(String[] args) {
		Propogate p = new Propogate(8,0);
		p.First();
	}
}
	class Propogate {
		
		public int a = 0;
		public int b = 0;
		
		public Propogate() {}

	public Propogate (int a, int b) {
		this.a = a;
		this.b = b;
		}
	public void First () {
		
		try { 
			int r = second();
			
			System.out.println(r);
	}
	catch(Exception e ) {
		System.out.println("not divided by 0");
	}
	finally {}
		}
	public int second() {
		return a/=b;
	}
	}

