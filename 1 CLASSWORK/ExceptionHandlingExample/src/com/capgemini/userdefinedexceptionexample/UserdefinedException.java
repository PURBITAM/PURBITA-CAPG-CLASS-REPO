package com.capgemini.userdefinedexceptionexample;

import java.util.Scanner;

public class UserdefinedException {
	
			public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("enter age : ");
				int age=sc.nextInt();
				try
				{
					if(age<18)
					{
						throw new AgeNotValid("age is below of range");
					}
					else if(age<80)
					{
						throw new AgeNotValid("age is out of range");
					}
				}
				catch(AgeNotValid an)
				{
					System.out.println(an.getMessage());
				}
			}
}
