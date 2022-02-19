package com.rays.Exception;

public class TestAccountException {
public static void main(String[] args) throws UnsufficentException {
	
Accountt ac = new Accountt("345603456","Saving Account", 5000.0);
    ac.withdraw(200);
	System.out.println(ac.getBalance());
}
}
