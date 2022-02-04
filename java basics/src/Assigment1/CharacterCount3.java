package Assigment1;

public class CharacterCount3 {

	public static void main(String[] args) {
		String Name= "Ram Sham Aam";
	    int s=0;
	    for(int i=Name.length();i>=1; i--) {
	    	if(Name.charAt(i-1)=='m') {
	    		s++;
	    	}
	    }
	    System.out.println(s);
	}
}
