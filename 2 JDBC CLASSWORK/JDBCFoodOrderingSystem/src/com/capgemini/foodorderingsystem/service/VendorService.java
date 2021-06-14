package com.capgemini.foodorderingsystem.service;

import java.util.Scanner;

import com.capgemini.foodorderingsystem.model.Vendor;


public class VendorService 
{
	public static void profile(Vendor pms,int custId)
	{
		int flag=0;
		while(true)
		{
			System.out.println("1. Update Customer Details");
			System.out.println("2. Delete Account");
			System.out.println("3. get Customer Details");
			System.out.println("4. exit profile page");
			int transaction=sc.nextInt();
			switch(transaction)
			{
				case 1:		pms.updateVendor(custId);
							break;
				case 2:		pms.deleteVendor(custId);
							break;
				case 3:		pms.getVendor(custId);
							break;
				case 4: 	flag=1;
							break;
			}
			if(flag==1)
			{
				break;
			}
		}
	}
	static Scanner sc=new Scanner(System.in);
	public void VendorChoice() 
	{
		// TODO Auto-generated method stub
		Vendor pms= new Vendor();
		pms.dbConnection();
		char cont='y';
		int transaction;
		int vId=0;
		String pwd;
		System.out.println("Enter the choice : ");
		System.out.println("1. Register");
		System.out.println("2. Login");
		transaction=sc.nextInt();
		switch(transaction)
		{
		case 1:		while(true)
					{
						vId=pms.insertVendor();
						{
							if(vId!=0)
							{
								break;
							}
						}
					}
					break;
		case 2:		while(true)
					{
						System.out.println("Enter Customer ID : ");
						vId=sc.nextInt();
						System.out.println("Enter password : ");
						sc.nextLine();
						pwd=sc.nextLine();
						if(pms.loginValidate(vId,pwd))
						{
							break;
						}
						else
						{
							System.out.println("Customer ID/password invalid");
						}
					}
					
					break;
		}
		
		while(true)
		{
			System.out.println("Enter the choice : ");
			System.out.println("1. Customer Profile");
			System.out.println("2. Add Item");
			System.out.println("3. Order history");
			System.out.println("4. Log out");
			transaction=sc.nextInt();
			switch(transaction)
			{
				case 1:		profile(pms,vId);
							break;
				case 2:		//pms.placeVendor(custId);
							break;
				case 3:		pms.getVendor(vId);
							break;
				case 4: 	System.out.println("Customer ID : "+vId+" logged out.");
							System.exit(0);
							break;
			}
			
			System.out.print("do you want to continue : ");
			cont=sc.next().trim().charAt(0);
			if(cont=='y')
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
