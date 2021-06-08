package controlstatements;

import java.util.Scanner;

public class ArraySwitchExample 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		char c='y';
		int sum=0,multi=1;
		int[] arr=new int[5];
		do 
		{	
			System.out.println("Enter choice");
			System.out.println("R -  Reading array values");
			System.out.println("P -  Printing array values");
			System.out.println("S -  Sum of array values");
			System.out.println("M -  Multiplication of array values");
			char choice = sc.next().trim().charAt(0);
			switch(choice)
			{
				case 'R':
				case 'r':	System.out.println("enter array values");
							for(int i=0;i<arr.length;i++)
							{
								arr[i]=sc.nextInt();
							}
							break;
				case 'P':
				case 'p':	System.out.println("print array values");
							for(int i=0;i<arr.length;i++)
							{
								System.out.print(arr[i]+" ");
							}
							System.out.println();
							break;
				case 'S':
				case 's':	System.out.println("sum of array values");
							for(int i=0;i<arr.length;i++)
							{
								sum+=arr[i];
							}
							System.out.println(sum);
							break;
				case 'M':
				case 'm':	System.out.println("product of array values");
							for(int i=0;i<arr.length;i++)
							{
								multi*=arr[i];
							}
							System.out.println(multi);
							break;
				default: 	System.out.println("no match found");
			}
			System.out.println("do you wand to continue : ");
			c = sc.next().trim().charAt(0);
		}
		while(c=='y');
	}
}
