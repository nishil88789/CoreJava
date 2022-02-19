package com.rays.Interface;

public class BusinessManTestClass {
public static void main(String[] args) {
	
	Richman rm = new Businessman();
	rm.donation();
    SocialWorker sw = new Businessman();
    sw.helpToOther();
    Businessman bm =new Businessman();
    bm.earnmoney();
    bm.party();
}
}
