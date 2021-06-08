package com.capgemini.abstractclassexample;

public class FixedDepositAccount extends BankAccount
{
	float rateOfInt=0.3f;
	float roi;
	float fixedBal=0;
	SavingsAccount sa;
	public FixedDepositAccount(SavingsAccount sa)
	{
		this.sa=sa;
	}
	@Override
	public void openAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calculateInterest() 
	{
		return fixedBal*rateOfInt;
	}

	@Override
	public void creditAmount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		
		System.out.println("amount left in the savings account = "+(actualBal-fixedBal));
		super.actualBal=actualBal-fixedBal;
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}
	
	public void fixedAmt(float actualBal)
	{
		super.actualBal=actualBal;
		System.out.println("Enter the amount for Fixed Deposit");
		fixedBal=sc.nextInt();
		roi=calculateInterest();
		
		
		System.out.println("Fixed Deposit Amount : "+(fixedBal));
		System.out.println("Fixed Deposit Amount with interest : "+(fixedBal+roi));
		checkBalance();
	}

}
