package controlstatements;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		float[] marks = new float[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks for 5 subjects : ");
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=sc.nextFloat();
		}
		System.out.println("the marks for 5 subjects : ");
		for(int i=0;i<marks.length;i++)
		{
			if(marks[i]<35)
			{
				System.out.print("failed ");
				System.out.println(marks[i]);
			}
			else
			{
				System.out.print("passed ");
				System.out.println(marks[i]);
			}
		}
	}
	
}
