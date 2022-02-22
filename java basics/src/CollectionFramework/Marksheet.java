package com.rays.CollectionFramework;

public class Marksheet implements Comparable<Marksheet> {

	public String RollNo;
	public String fname;
	public String Lname;
	public int Marks;
	
	public Marksheet() {
	}

	public String getRollNo() {
		return RollNo;
	}

	public void setRollNo(String rollNo) {
		RollNo = rollNo;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public int getMarks() {
		return Marks;
	}

	public void setMarks(int marks) {
		Marks = marks;
	}

	
	public int compareTo(Marksheet o) {
		return this.RollNo.compareTo(o.getRollNo());
	}
}
