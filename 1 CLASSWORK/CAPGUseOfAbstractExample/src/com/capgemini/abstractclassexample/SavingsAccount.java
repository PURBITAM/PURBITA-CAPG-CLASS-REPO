package com.capgemini.abstractclassexample;

public class SavingsAccount extends BankAccount
{
	float rateOfInt=0.3f;
	int withdrawAmt;
	int depAmt;
	
	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//initializer block
	{ 
		minBal=3000;
	}
	
	@Override
	public void openAccount() 
	{
		super.enterDetailsToOpenAccount();
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

	@Override
	public float calculateInterest() 
	{
		return actualBal*rateOfInt;
	}

	@Override
	public void creditAmount() 
	{
		System.out.println("amount credited = "+calculateInterest());
		actualBal=calculateInterest();
	}

	@Override
	public void checkBalance() 
	{
		System.out.println("amount credited = "+(actualBal+calculateInterest()));
		actualBal=actualBal+calculateInterest();
	}

	@Override
	public void withdraw() 
	{
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
		super.actualBal=actualBal;
	}
	public float updateAmount() 
	{
		return (actualBal-withdrawAmt);
	}
}
