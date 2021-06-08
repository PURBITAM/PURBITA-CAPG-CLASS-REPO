package controlstatements;

import java.util.Scanner;

public class ValidateAge 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age : ");
		int age=sc.nextInt();
		if(age>18)
		{
			System.out.println("age is valid");
			System.out.println("you are eligible for voting");
		}
		else
		{
			System.out.println("age is not valid");
		}
	}
}
