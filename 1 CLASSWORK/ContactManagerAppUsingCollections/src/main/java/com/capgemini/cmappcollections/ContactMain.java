package com.capgemini.cmappcollections;

import java.util.Collection;
import java.util.Scanner;

import com.capgemini.cmappcollections.model.Contact;
import com.capgemini.cmappcollections.service.ContactManager;

public class ContactMain {
		static Scanner ip=new Scanner(System.in);
		static String fname;
		static String lname;
		static String phno;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContactManager cm=new ContactManager();
		//System.out.println("Enter the choice : ");
		char ch;
		char choice='y';
		while(choice=='y')
		{
			System.out.println("Enter choice");
			System.out.println("a:read contact");
			System.out.println("g:get contact list");
			System.out.println("f:find a contact");
			System.out.println("u:update contact");
			System.out.println("d:delete a contact");
			ch=ip.next().trim().charAt(0);
			switch(ch)
			{
				case 'a' :	readDetails();
							cm.addContact(fname,lname,phno);
							break;
				case 'g' :	Collection<Contact>c=cm.getAllContacts();
							System.out.println(c);
							break;
				case 'f' :	System.out.println("***code here to find a contact by key");
							break;
				case 'u' :	System.out.println("***code here to update a contact by key");
							break;
				case 'r' :	System.out.println("***code here to remove a contact by key");
							break;
				default : 
							break;
			}
			System.out.println("Do you want to continue : ");
			choice=ip.next().trim().charAt(0);
		}
	}
	
	public static void readDetails()
	{
		System.out.println("Enter the contact details");
		System.out.println("Enter the First Name : ");
		fname=ip.next();
		System.out.println("Enter the Last Name : ");
		lname=ip.next();
		System.out.println("Enter the Phone Number : ");
		phno=ip.next();
	}
}
