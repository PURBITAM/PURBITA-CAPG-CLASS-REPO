package com.capgemini.abstractclassexample;

public class CurrentAccount extends BankAccount
{
	SavingsAccount sa;
	public CurrentAccount(SavingsAccount sa)
	{
		this.sa=sa;
	}
	@Override
	public void openAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calculateInterest() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void creditAmount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		sa.checkBalance();
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}
	
	public void viewAccount(float fixedBal,float actualBal)
	{
		if(fixedBal==0 && actualBal==0)
		{
			System.out.println("Account Empty");
			System.out.println("No fixed Deposit");
		}
		else if(fixedBal==0)
		{
			System.out.println("Amount in Savings = "+actualBal);
			System.out.println("No fixed Deposit");
		}
		else
		{
			System.out.println("current account status = "+actualBal+"\nFixed Deposit Amount =  "+fixedBal);
		}
		
	}
}
