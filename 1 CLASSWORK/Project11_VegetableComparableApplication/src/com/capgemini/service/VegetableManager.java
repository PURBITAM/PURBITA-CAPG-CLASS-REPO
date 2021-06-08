package com.capgemini.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import com.capgemini.model.Vegetable;

public class VegetableManager 
{
	int vegId;
	String vegName;
	double vegPrice;
	ArrayList<Vegetable> al=new ArrayList<Vegetable>();
	Scanner sc=new Scanner(System.in);
	public ArrayList<Vegetable> vegCreate(ArrayList<Vegetable> al) 
	{
		System.out.println("Enter vegID : ");
		vegId=sc.nextInt();
		System.out.println("Enter vegName : ");
		vegName=sc.next();
		System.out.println("Enter price : ");
		vegPrice=sc.nextDouble();
		al.add(new Vegetable(vegId,vegName,vegPrice));
		return al;
	}
	
	public void vegRead(ArrayList<Vegetable> al2) {
		// TODO Auto-generated method stub
		System.out.println("======================================================");
		for(int i=0;i<al2.size();i++)
		{
			System.out.println(al2.get(i).getVegId()+" "+al2.get(i).getVegname()+" "+al2.get(i).getVegPrice());
		}
		System.out.println("======================================================");
	}

	public void vegSort(ArrayList<Vegetable> al2) 
	{
		System.out.println("sort by : 1.id  2.name  3.price");
		int ch=sc.nextInt();
		if(ch==1)
		{
			Collections.sort(al2,new VegIdComparator());
			System.out.println("sort by id");
			vegRead(al2);
		}
		else if(ch==2)
		{
			Collections.sort(al2,new VegNameComparator());
			System.out.println("sort by name");
			vegRead(al2);
		}
		else if(ch==3)
		{
			Collections.sort(al2,new VegPriceComparator());
			System.out.println("sort by price");
			vegRead(al2);
		}
	}
//	public void sortProductUsingVegID(ArrayList<Vegetable> al2)
//	{
//		Collections.sort(al2,new VegIdComparator());
//		System.out.println("sort by id");
//		vegRead(al2);
//	}
//	
//	public void sortProductVegName(ArrayList<Vegetable> al2)
//	{
//		Collections.sort(al2,new VegIdComparator());
//		System.out.println("sort by id");
//		vegRead(al2);
//	}
	public ArrayList<Vegetable> vegUpdate(ArrayList<Vegetable> al2) {

		System.out.println("Enter the vegID to update : ");
		int vegId=sc.nextInt();
		int flag=0;
		for(int i=0;i<al2.size();i++)
		{
			if(al2.get(i).getVegId()==vegId)
			{
				flag=1;
				System.out.println("Enter name : ");
				vegName=sc.next();
				al2.get(i).setVegname(vegName);
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("not found");
		}
		return al2;
	}

	public ArrayList<Vegetable> vegDelete(ArrayList<Vegetable> al2) {
		System.out.println("Enter the vegID to delete : ");
		int vegId=sc.nextInt();
		int flag=0;
		for(int i=0;i<al2.size();i++)
		{
			if(al2.get(i).getVegId()==vegId)
			{
				flag=1;
				al2.remove(i);
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("not found");
		}
		return al2;
	}
}
