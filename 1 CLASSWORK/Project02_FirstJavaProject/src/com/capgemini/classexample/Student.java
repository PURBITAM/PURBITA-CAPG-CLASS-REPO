package com.capgemini.classexample;

import java.util.Date;
import java.util.Scanner;
public class Student 
{
	private int stdId;
	private String stdName;
	private float[] marks=new float[5];
	//private Date dob; -> date,time,locale date -> ma'am
	Scanner sc=new Scanner(System.in);
	public void readStudentDetails()
	{
		System.out.println("Enter the Student ID : ");
		stdId=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Student Name : ");
		stdName=sc.nextLine();
		System.out.println("Enter the Student Marks : ");
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=sc.nextInt();
		}
	}
	
	public void displayStudentDetails()
	{
		System.out.println("Student ID : "+stdId);
		System.out.println("Student Name : "+stdName);
		System.out.println("Student Marks : ");
		for(int i=0;i<marks.length;i++)
		{
			System.out.print(marks[i]+" ");
		}
	}
	
}
