package ExerciseCollection;

public class Questions7 {

import java.util.LinkedList;

import javax.sound.midi.MidiChannel;

public static void main(String [] args) {
		
		LinkedList ll = new LinkedList();
  
		ll.add(1);
		ll.add(3);
		ll.add(5);
		ll.add(6);
		ll.add(13);
		
		System.out.println("linkedlist"+ll);
		
		int middle = (int)ll.get(ll.size()/2);
		
		System.out.println("middle element :-"+middle);	
	}
}

}
}