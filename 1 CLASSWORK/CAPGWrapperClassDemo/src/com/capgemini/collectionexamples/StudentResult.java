package com.capgemini.collectionexamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentResult 
{
	public static void main(String[] args) 
	{
		ArrayList stdList=new ArrayList();
		System.out.println();
		ArrayList<Student> resList = new ArrayList<Student>();
		Student  std;
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("Enter the details of Student");
			System.out.println("Enter the Student id");
			int id = sc.nextInt();
			System.out.println("Enter the Student Name");
			String name = sc.next();
			System.out.println("Enter Student Marks : ");
			Float marks = sc.nextFloat();
			resList.add(new Student(id,name,marks));
		}
		
		Iterator<Result> resItr = stdList.iterator();
		System.out.println("Student ArrayList values using Iterator");
		while(resItr.hasNext()) {
			Result st = resItr.next();
			System.out.println(st.getSname() + " \t\t\t " + st.getSid() + " \t\t\t " + st.announceResult());
			System.out.println();
		}
	}
	
}
