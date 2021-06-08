package com.capgemini.contactmanager;

public class MainContact {
	public static void main(String[] args) {
		Contact c=new Contact();
		c.readDetails();
		System.out.println(c.displayDetails());
	}
}
