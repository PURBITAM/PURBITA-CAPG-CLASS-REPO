package com.capgemini.authorapp;

import java.util.Collection;
import java.util.Scanner;

import com.capgemini.authorapp.model.Author;
import com.capgemini.authorapp.service.AuthorManager;

public class AuthorMain {

	static Scanner ip=new Scanner(System.in);
	static String name;
	static String email;
	static char gender;
	public static void main(String[] args) 
	{
		AuthorManager au=new AuthorManager();
		//System.out.println("Enter the choice : ");
		char ch;
		char choice='y';
		while(choice=='y')
		{
			System.out.println("Enter choice");
			System.out.println("a:read author details");
			System.out.println("g:get author list");
			ch=ip.next().trim().charAt(0);
			switch(ch)
			{
				case 'a' :	readDetails();
							au.addAuthor(name,email,gender);
							break;
				case 'g' :	Collection<Author>c=au.getAllAuthor();
							System.out.println(c);
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
		System.out.println("Enter the Name : ");
		name=ip.next();
		System.out.println("Enter the Email : ");
		email=ip.next();
		System.out.println("Enter the gender (m/f/u): ");
		gender=ip.next().trim().charAt(0);
	}
}
