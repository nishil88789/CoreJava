package ExerciseExceptionHandling;

public class Exception5 {

	public static void main(String[] args) {
		 try {
			 System.out.println(1/0);
		 }
		 catch(ArithmeticException e) {
			 System.out.println("Exception Handling");
		 }
		 catch(RuntimeException r) {
			 System.out.println("Runtime Exception");
		 }
		 finally {
			 System.out.println("Hello Java");
		 }
	}
}
