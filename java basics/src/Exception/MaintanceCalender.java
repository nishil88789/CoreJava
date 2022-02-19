package com.rays.Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MaintanceCalender {

	public static void main(String[] args) throws ParseException {
		 Date d = new Date();
		 System.out.println(d);
		 
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		 String s = sdf.format(d);
		 System.out.println(s);
		 
		
		 Calendar c = Calendar.getInstance();
		 
		 caldr(c);
		 
	}
 public static void caldr(Calendar c) {
	 for(int i =0;i<10;i++);
	 c.add(Calendar.DATE,10);
	 Date n = c.getTime();
	 System.out.println(n);
			 
 }
}
