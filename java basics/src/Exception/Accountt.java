package com.rays.Exception;

public class Accountt {

	private String number;
	private String accountType;
	private double balance;
	
	public Accountt() {}
	public Accountt(String r, String a, double b) {
	 number = r; 
	 accountType = a;
	 balance = b;
	 
	}
	public String getNumber() {
		return number;
	}
	public String getAccountType() {
		return accountType;
	}
	public double getBalance() {
		return balance;
		}
	public void withdraw(double i)
		throws UnsufficentException {
		double d  = getBalance();
		
		if (d-500<i) {
			UnsufficentException e = new UnsufficentException();
			throw e;
		}
		d -= i;
		 this.balance = d;
		 }
	
	
	public void fundTransfer(double i) {
		double d = getBalance();
	    d = i;
	    this.balance = d;
	}
}
