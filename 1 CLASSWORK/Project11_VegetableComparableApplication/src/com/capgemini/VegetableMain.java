package com.capgemini;

import java.util.ArrayList;
import java.util.Scanner;

import com.capgemini.model.Vegetable;
import com.capgemini.service.VegetableManager;

public class VegetableMain {

	static ArrayList<Vegetable> al=new ArrayList<Vegetable>();
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Vegetable veg=new Vegetable();
		VegetableManager vegM=new VegetableManager();
		int ch;
		while(true)
		{
			System.out.println("Enter choice");
			System.out.println("1. Create");
			System.out.println("2. Read");
			System.out.println("3. Read data sorted order");
			System.out.println("4. Update");
			System.out.println("5. Delete");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1 : 	al=vegM.vegCreate(al);
						break;
			case 2 : 	vegM.vegRead(al);
						break;
			case 3 : 	vegM.vegSort(al);
						break;
			case 4 : 	al=vegM.vegUpdate(al);
						break;
			case 5 : 	al=vegM.vegDelete(al);
						break;
			}
			System.out.println("Want to continue : 1.yes 2.no");
			ch=sc.nextInt();
			if(ch==1)
			{
				continue;
			}
			else
			{
				break;
			}
		}
	}

}
