package com.capgemini.userdefinedexceptionexample;

import java.util.Scanner;

public class MobileNumberCkeckMain 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Mobile Number : ");
		long mobileNo=sc.nextLong();
		String str=""+mobileNo;
		try
		{
			if(str.length()<10)
			{
				throw new MobileNumberNotValid("mobile number is less than 10 digits");
			}
			else if(str.length()>10)
			{
				throw new MobileNumberNotValid("mobile number is greater than 10 digits");
			}
			else
			{
				System.out.println("Mobile number is Correct");
			}
		}
		catch(MobileNumberNotValid an)
		{
			System.out.println(an.getMessage());
		}
		
	}
}
