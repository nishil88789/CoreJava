package Assigment1;

public class StringReverse {
   public static void main(String [] args) {
	//My Name is Nishil
	//Nishil is Name My
	   
	   String str = "My Name is Nishil";
	   String[] a = str.split(" ");
	   for(int i = 0; i < a.length; i++)
	   {
		   System.out.print(a[i] + " ");
	   }
		   for(int i = a.length-1; i>=0; i--) {
   
      System.out.println("");
   }
}
}