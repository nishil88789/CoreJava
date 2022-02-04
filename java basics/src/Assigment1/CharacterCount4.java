package Assigment1;

public class CharacterCount4 {
public static void main(String[] args) {
	String Name = "Fortuner Fortuner";
	int s=0;
			for(int i= Name.length();i>=1; i--) {
				if(Name.charAt(i-1)=='F') {
					s++;
				}
			}
			System.out.println(s);
}
}
