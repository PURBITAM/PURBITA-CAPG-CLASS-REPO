package polymorphismdemo;

import java.util.Scanner;

public class SavingsAccount extends Account
{
	int age;
	float si;
	final float rateOfInterest=0.5f;
	public SavingsAccount()
	{
		super();
	}
	public void readAge()
	{
		System.out.println("Enter the age of account holder");
		age=sc.nextInt();
	}
	public void calculateInterest()
	{
		System.out.println("Interest is calculated here...");
		if(age<60)
		{
			si=getAccBalance()*0.5f;
		}
		else
		{
			si=getAccBalance()*0.6f;
		}
		
	}
	
	public void calculateInterest(int yr)
	{
		System.out.println("Interest is calculated here...");
		if(age<60)
		{
			si=getAccBalance()*0.5f*yr;
		}
		else
		{
			si=getAccBalance()*0.6f*yr;
		}
		
	}
}
