package com.capgemini.interfaceexample;

import java.util.Scanner;

public class SavingsAccount implements BankAccount
{
	int accId;
	String accHolderName;
	float minBal;
	float actualBal;
	String address;
	String accType;
	Scanner sc=new Scanner(System.in);
	float rateOfInt=0.3f;
	int withdrawAmt;
	int depAmt;
	@Override
	public void createNewAccount() {
		// TODO Auto-generated method stub
		//super.enterDetailsToOpenAccount();
		System.out.println("Enter accID");
		accId = sc.nextInt();
		System.out.println("Enter accHolderName");
		sc.nextLine();
		accHolderName = sc.nextLine();
		System.out.println("Enter address");
		address = sc.nextLine();
		System.out.println("Enter accBal");
		actualBal = sc.nextFloat();
	}
	public float calculateInterest() 
	{
		return actualBal*rateOfInt;
	}
	@Override
	public void addAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkAccountBalance() {
		// TODO Auto-generated method stub
		System.out.println("amount credited = "+(actualBal+calculateInterest()));
		actualBal=actualBal+calculateInterest();
	}

	@Override
	public void withdrawAmount() {
		// TODO Auto-generated method stub
		
		System.out.println(actualBal);
		System.out.println("Enter amount to withdraw");
		withdrawAmt = sc.nextInt();
		System.out.println("After withdraw, balance = "+(updateAmount()));
		System.out.println("thank you");
		actualBal=updateAmount();
	}
	public void addMoney()
	{
		System.out.println("Enter the amount to deposit");
		depAmt=sc.nextInt();
		actualBal+=depAmt;
		System.out.println("After deposit, balance = "+(actualBal));
		System.out.println("thank you");
	}
	public float updateAmount() 
	{
		return (actualBal-withdrawAmt);
	}

}
