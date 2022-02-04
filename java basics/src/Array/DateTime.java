package Array;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {
	public static void main(String[] args) {
		Date d= new Date();
		System.out.println("Date :");
	SimpleDateFormat A=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String s=A.format(d);
		System.out.println(s);
	}

}

