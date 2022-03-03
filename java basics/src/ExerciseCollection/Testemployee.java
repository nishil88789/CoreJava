package ExerciseCollection;
 
	import java.util.ArrayList;
	import java.util.Collection;
	import java.util.Collections;

import CollectionnnFrammee.Employe;

public class Testemployee {
		//private static final String Employ = null;

		public static void main(String[] args) throws Exception {

			ArrayList a = new ArrayList();
			a.add(new Employe("Jaiveer", "Nahta", 2500));
			a.add(new Employe("Shivam", "Patel", 5000));
			a.add(new Employe("Rishi", "Sharma", 10000));

			

			//Collections.sort(a , b );
			
			Collections.sort(a);
			

			for (Object o : a) {
				System.out.println(o);
			}


		}
	}


