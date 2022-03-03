package ExerciseCollection;

    import java.util.HashSet;
	import java.util.Iterator;
	import java.util.LinkedHashSet;
	import java.util.TreeSet;

public class Questionnn6 {
		public static void main(String[] args) {
			
			HashSet h = new HashSet();
			
			h.add("One");
			h.add("Two");
			h.add("Three");
			h.add("Four");
			h.add("Five");
			h.add("Six");
			h.add("Seven");
			h.add("Eight");
			h.add("Nine");
			h.add("Ten");
			
			Iterator it = h.iterator();
			while (it.hasNext()) {
				Object ob = (Object) it.next();
				
				System.out.println("Hashset :-"+ob);
				}
			TreeSet t =new TreeSet();
			
			t.add("One");
			t.add("Two");
			t.add("Three");
			t.add("Four");
			t.add("Five");
			t.add("Six");
			t.add("Saven");
			t.add("Eight");
			t.add("Nine");
			t.add("Ten");
			
			Iterator it1 = t.iterator();
			while (it1.hasNext()) {
				Object o = (Object) it1.next();
				
				System.out.println("Treeset :-"+o);
			}
		
			LinkedHashSet lh = new LinkedHashSet();
			lh.add("One");
			lh.add("Two");
			lh.add("Three");
			lh.add("Four");
			lh.add("Five");
			lh.add("Six");
			lh.add("Saven");
			lh.add("Eight");
			lh.add("Nine");
			lh.add("Ten");
			
			Iterator it2 = t.iterator();
			while (it2.hasNext()) {
				Object obj = (Object) it2.next();
				
				System.out.println("LinkedHashSet :-"+obj);
			}
					
		
		
		
		}
	}


