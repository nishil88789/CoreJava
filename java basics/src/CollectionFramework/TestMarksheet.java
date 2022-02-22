package com.rays.CollectionFramework;

import java.util.ArrayList;
import java.util.*;
import java.util.Iterator;

public class TestMarksheet {

	public static void main(String[] args) {
		
		Marksheet m1 = new Marksheet();
		m1.setRollNo("123232");
		m1.setFname("Raj");
		m1.setLname("Singh");
		m1.setMarks(50);
		
		Marksheet m2 = new Marksheet();
		m2.setRollNo("11111");
		m2.setFname("Suraj");
		m2.setLname("Jain");
		m2.setMarks(60);
		
		Marksheet m3 = new Marksheet();
		m3.setRollNo("23222");
		m3.setFname("Dheraj");
		m3.setLname("Rathore");
		m3.setMarks(80);
		
		ArrayList a =  new ArrayList();
		a.add(m1);
		a.add(m2);
		a.add(m3);
		
		Collections.sort(a);
		
		Iterator it = a.iterator();
		
		while (it.hasNext()) {
			Marksheet m= (Marksheet) it.next();
			
			System.out.println(m.getRollNo()+" "+m.getFname()+" "+m.getLname()+" "+m.getMarks());
		}
	}
}
