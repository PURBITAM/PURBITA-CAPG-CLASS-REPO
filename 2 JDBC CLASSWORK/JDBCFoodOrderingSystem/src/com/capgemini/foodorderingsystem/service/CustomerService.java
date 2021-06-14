package com.capgemini.foodorderingsystem.service;

import java.util.Scanner;

import com.capgemini.foodorderingsystem.model.Customer;

public class CustomerService 
{
	public static void profile(Customer pms,int custId)
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
				case 1:		pms.updateCustomer(custId);
							break;
				case 2:		pms.deleteCustomer(custId);
							break;
				case 3:		pms.getCustomer(custId);
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
	public void customerChoice() 
	{
		// TODO Auto-generated method stub
		Customer pms= new Customer();
		pms.dbConnection();
		char cont='y';
		int transaction;
		int custId=0;
		String pwd;
		System.out.println("Enter the choice : ");
		System.out.println("1. Register");
		System.out.println("2. Login");
		transaction=sc.nextInt();
		switch(transaction)
		{
		case 1:		while(true)
					{
						custId=pms.insertCustomer();
						break;

					}
					break;
		case 2:		while(true)
					{
						System.out.println("Enter Customer ID : ");
						custId=sc.nextInt();
						System.out.println("Enter password : ");
						sc.nextLine();
						pwd=sc.nextLine();
						if(pms.loginValidate(custId,pwd))
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
			System.out.println("2. Place Order");
			System.out.println("3. Order history");
			System.out.println("4. Recharge Wallet Amount");
			transaction=sc.nextInt();
			switch(transaction)
			{
				case 1:		profile(pms,custId);
							break;
				case 2:		pms.placeOrder(custId);
							break;
				case 3:		pms.getCustomer(custId);
							break;
				case 4: 	System.out.println("Customer ID : "+custId+" logged out.");
							System.exit(0);
							break;
			}
			
			System.out.print("do you want to LOG OUT y/n : ");
			cont=sc.next().trim().charAt(0);
			if(cont=='n')
			{
				continue;
			}
			else if(cont=='y')
			{
				break;
			}
		}
	}
}
