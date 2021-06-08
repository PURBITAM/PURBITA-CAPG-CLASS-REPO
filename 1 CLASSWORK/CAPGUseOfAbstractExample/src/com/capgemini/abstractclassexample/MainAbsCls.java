package com.capgemini.abstractclassexample;

import java.util.Scanner;

public class MainAbsCls 
{
	static float actualBal;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SavingsAccount sa=new SavingsAccount();
		CurrentAccount ca=new CurrentAccount(sa);
		FixedDepositAccount fda=new FixedDepositAccount(sa);
		Scanner sc=new Scanner(System.in);
		int ch;
		while(true)
		{
			System.out.println("Enter the choice : ");
			System.out.println("addMoney");
			System.out.println("withdrawMoney");
			System.out.println("CheckBal");
			System.out.println("FixedDeposit");
			System.out.println("CurrentAccount");
			String option=sc.next();
			switch(option)
			{
				case "addMoney":
								sa.addMoney();
								break;
				case "withdrawMoney":
								System.out.println("Current Balance : "+sa.actualBal);
								sa.withdraw();
								break;
				case "CheckBal":
								System.out.println("Current Balance : "+sa.actualBal);
								sa.checkBalance();
								break;
				case "FixedDeposit":
								fda.fixedAmt(sa.actualBal);
								if(fda.actualBal!=0)
								{
									sa.actualBal=fda.actualBal;
								}
								break;		
				case "CurrentAccount":
								fda.actualBal=sa.actualBal;
								ca.viewAccount(fda.fixedBal,fda.actualBal);
								break;
				default:
					System.out.println("not a valid option");
			}
			
			System.out.println("enter choice 1.yes 2.no ");
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
