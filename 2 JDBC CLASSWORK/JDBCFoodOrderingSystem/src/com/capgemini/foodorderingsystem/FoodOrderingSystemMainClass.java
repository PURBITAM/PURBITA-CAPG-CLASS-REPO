package com.capgemini.foodorderingsystem;

import java.util.Scanner;

import com.capgemini.foodorderingsystem.service.CustomerService;
import com.capgemini.foodorderingsystem.service.VendorService;

public class FoodOrderingSystemMainClass 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Customer cus= new Customer();
		CustomerService cus= new CustomerService();
		VendorService ven=new VendorService();
		//cus.dbConnection();
		char cont='y';
		int transaction;
		while(true)
		{
			System.out.println("Enter the choice : ");
			System.out.println("1. Customer");
			System.out.println("2. Vendor");
			System.out.println("3. Orders");
			System.out.println("4. Items");
			System.out.println("5. exit");
			transaction=sc.nextInt();
			switch(transaction)
			{
				case 1:		cus.customerChoice();
							break;
				case 2:		ven.VendorChoice() ;
							break;
				case 3:		//pms.deleteProductUsingId();
							break;
				case 4:		//pms.getProductById();
							break;
				case 5:		System.out.println("Thank you for visiting");
							System.out.println("Please visit again");
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
