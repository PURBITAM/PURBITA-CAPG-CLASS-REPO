package com.capgemini.abstractclassexample;

import java.util.Scanner;

public abstract class BankAccount 
{
	int accId;
	String accHolderName;
	float minBal;
	float actualBal;
	String address;
	String accType;
	Scanner sc=new Scanner(System.in);
	public BankAccount()
	{
		super();
	}
	public BankAccount(int accId, String accHolderName, float minBal, float actualBal, String address, String accType) {
		super();
		this.accId = accId;
		this.accHolderName = accHolderName;
		this.minBal = minBal;
		this.actualBal = actualBal;
		this.address = address;
		this.accType = accType;
		this.sc = sc;
	}
	
	
	
	public void enterDetailsToOpenAccount()
	{
		System.out.println("Enter the details to Open an Account");
	}
	//abstract methods
	public abstract void openAccount(); //method signature;
	public abstract float calculateInterest();
	public abstract void creditAmount();
	public abstract void checkBalance();
	public abstract void withdraw();
}
