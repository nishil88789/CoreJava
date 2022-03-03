package ExerciseCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class Question1 {
		public static void main(String[] args) {
			
			ArrayList a = new ArrayList();
			
			a.add("Rays");
			a.add("Technologies");
		    a.add("Indore");
 
		    Iterator it = a.iterator();
		    while (it.hasNext()) {
				 Object o =  it.next();
		    System.out.println(o);
		}
}
}