package Assigment1;

public class Charactercount {
	public static void main(String[] args) {
		String name="Mega Technologies";
				int s=0;
		for (int i = name.length(); i>=1;i--) {
			if (name.charAt(i-1)=='e') {
				s++;
			}
			
		}		
		System.out.println(s);
	}

}
