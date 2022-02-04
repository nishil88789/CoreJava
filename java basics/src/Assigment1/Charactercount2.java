package Assigment1;

public class Charactercount2 {
 
	public static void main(String[] args) {
		String Name= "Computer Technology";
		int s=0;
		for(int i=Name.length();i>=1;i--) {
			if(Name.charAt(i-1)=='o') {
			s++;
		}
		}
		System.out.println(s);
	}
}
