package stringexamples;

import java.util.Scanner;

public class Employee 
{
	private int empId;
	private String empName;
	Scanner sc=new Scanner(System.in);
	public void readEmpDetails()
	{
		System.out.println("Enter id : ");
		empId=sc.nextInt();
		sc.nextLine();
		System.out.println("enter name : ");
		empName=sc.nextLine();
	}
	public void printEmpDetails()
	{
		System.out.println("Employee ID: "+empId);
		System.out.println("Employee Name: "+empName);
	}
}
