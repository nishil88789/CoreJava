package Assigment1;

public class Charactercount1 {
 public static void main(String[] args) {
	String Name ="Rays Technology";
      int s=0;
      for(int i =Name.length();i>=1; i--) {
    	  if(Name.charAt(i-1)=='a') {
    		  s++;
    	  }
    	  
}
System.out.println(s);
 }

}
