package com.rays.CollectionFramework;

import java.util.Comparator;

public class OrderByName implements Comparator<Marksheet>{

	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		
		return o1.getFname().compareTo(o2.getFname());
	}
  
	public int compare1(Marksheet o1, Marksheet o2) {
		return o1.getLname().compareTo(o2.getLname());
	
}

}

