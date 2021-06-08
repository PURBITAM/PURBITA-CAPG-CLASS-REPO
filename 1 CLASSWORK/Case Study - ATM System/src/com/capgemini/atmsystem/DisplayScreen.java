package com.capgemini.atmsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class DisplayScreen 
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		int ch,id;
		String CustomerName,Address,Email;
		int PIN,AccountNumber;
		long CardID;
		double Balance;
		
		Transaction trans=new Transaction();
		SavingsAccount sa=new SavingsAccount();
		CurrentAccount ca=new CurrentAccount();
		
		ArrayList<Transaction> alt=new ArrayList<Transaction>();
		ArrayList<Account> alc=new ArrayList<Account>();
		
		ArrayList<BankCustomer> albc=new ArrayList<BankCustomer>();
		ArrayList<ATMCard> alatm=new ArrayList<ATMCard>();
		ArrayList<SavingsAccount> alsa=new ArrayList<SavingsAccount>();
		//==========
		Transaction trans1=new Transaction();
		System.out.println("==============================================================");
		System.out.println("\t\t        _____________");
		System.out.println("\t\t    ____     | |    __     __" );
		System.out.println("\t\t   / /\\ \\    | |   |  \\   /  |");
		System.out.println("\t\t  / /__\\ \\   | |   | |\\\\ //| |");
		System.out.println("\t\t /_/    \\_\\  |_|   |_| \\_/ |_| ");
		System.out.println();
		System.out.println("==============================================================");
		while(true)
		{	
			System.out.println("1. ATM\n2. More");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1 : 	System.out.println("Enter Card");
						System.out.println("===================== ATM DISPLAY SCREEN ======================");
						alt=trans.startTransaction();
						if(alt.get(alt.size()-1).getStatus()==null)
						{
							System.out.println("===============================================================");
							break;
						}
						else
						{
							int id1=alt.get(alt.size()-1).getPIN();
							alsa=sa.CalculateInterest(alc,alatm,alsa,id1);
							int accno2=0;
							for(int i=0;i<alc.size();i++)
							{
								if(alatm.get(i).getPIN()==id1)
								{
									accno2=alc.get(i).getAccountNumber();
									break;
								}
							}
							System.out.println("========================= RECEIPT =============================");
							ca.displayATM(alt,albc,alc,alatm,alsa,accno2);
							System.out.println();
							trans.getTransactionATM(alt, albc, alc, alatm,alsa,id1);
							System.out.println("===============================================================");
							break;
						}
						
			case 2 :	
						while(true)
						{
							System.out.println("1. Insert Customer Details\n2. display customer details\n3. Display all customer details\n4. update details\n5. Transaction\n6. View Transaction \n7. View All Transactions \n8. View Account details");
							ch=sc.nextInt();
							switch(ch)
							{
								case 1 : 	System.out.println("======================== INSERT DETAILS =======================");
											alc=trans.insert();
											albc=trans.BankCustomerArrList();
											alatm=trans.ATMCardArrList();
											alsa=sa.CalculateInterest(alc,alatm,alsa,alc.get(alc.size()-1).getAccountNumber());
											break;
								case 2 : 	System.out.println("======================= VIEW CUSTOMER DETAILS ========================");
											System.out.println("Enter the Account Number : ");
											id=sc.nextInt();
											trans.displayById(alc,id);
											break;
								case 3 : 	System.out.println("================= DISPLAY ALL CUSTOMERS' DETAILS ====================");
											trans.display(alc,alsa);
											break;
								case 4 : 	System.out.println("======================= UPDATE DETAILS ========================");
											System.out.println("Enter the Account Number : ");
											id=sc.nextInt();
											trans.updateById(alc,albc,alatm,id);
											break;
								case 5 : 	System.out.println("======================== TRANSACTION ==========================");
											alt=trans.startTransaction();
											int id2=alt.get(alt.size()-1).getPIN();
											alsa=sa.CalculateInterest(alc,alatm,alsa,id2);
											break;
								case 6 : 	System.out.println("====================== VIEW TRANSACTION =======================");
											System.out.println("Enter PIN : ");
											id=sc.nextInt();
											trans1.getTransaction(alt,albc,alc,alatm,alsa,id); 
											break;
								case 7 : 	System.out.println("==================== VIEW ALL TRANSACTION =====================");
											trans.getAllTransaction(); 
											break;			
								case 8 :	System.out.println("================ VIEW ACCOUNT DETAILS =================");
											System.out.println("Enter the Account Number : ");
											id=sc.nextInt();
											ca.displayById(alt,albc,alc,alatm,alsa,id);
											break;
								default : 	System.out.println("Wrong choice");
							}
							System.out.println("---------------------------------------");
							System.out.print("Want to continue 1. yes  2. no : ");
							ch=sc.nextInt();
							System.out.println("---------------------------------------");
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
			
			System.out.println("---------------------------------------");
			System.out.print("Want to eject Card 1. yes  2. no : ");
			ch=sc.nextInt();
			if(ch==2)
			{
				System.out.println("---------------------------------------");
				continue;
			}
			else
			{
				System.out.println("Card Ejected");
				System.out.println("---------------------------------------");
				break;
			}
		}
	}
}
