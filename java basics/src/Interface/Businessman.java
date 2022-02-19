package com.rays.Interface;

import OOP.Person;

public class Businessman extends Person implements Richman, SocialWorker {

	@Override
	public void helpToOther() {
		System.out.println("help together");
		
	}

	@Override
	public void earnmoney() {
		System.out.println("earn money");
		
	}

	@Override
	public void donation() {
		System.out.println("donation");
		
	}

	@Override
	public void party() {
		System.out.println("party ");
		
	}
	
}
