package Assigment1;

public class CharacterCount5 {
public static void main(String[] args) {
	String Name = "Nishil Sharma";
	int s= 0;
	int r = 0;
	char t ='i';
	char u ='a';
	
	for( int i=0;i<Name.length();i++) {
			if(t==Name.charAt(i)) {
			s++;
		}
		if(u==Name.charAt(i)){
			r++;
		}
	}
	System.out.println("For char I="+s);
	System.out.println("For char A="+r);
}
}
