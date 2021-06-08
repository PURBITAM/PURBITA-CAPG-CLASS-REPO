package polymorphismdemo;

import java.util.Scanner;

public class Account 
{
	private int accId;
	private String accHolderName;
	private float accBalance;
	Scanner sc=new Scanner(System.in);
	
	public Account(){}
	public Account(int accId, String accHolderName, float accBalance) {
		super();
		this.accId = accId;
		this.accHolderName = accHolderName;
		this.accBalance = accBalance;
	}
	
	
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public float getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(float accBalance) {
		this.accBalance = accBalance;
	}
	public Scanner getSc() {
		return sc;
	}
	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	
	public void openAccount()
	{
		System.out.println("Enter account detais :-");
		System.out.println("Enter account id : ");
		accId=sc.nextInt();
		System.out.println("Enter account holder name : ");
		sc.nextLine();
		accHolderName=sc.nextLine();
		System.out.println("Enter account id : ");
		accBalance=sc.nextFloat();
	}
	
	public void viewAccountDetails()
	{
		System.out.println("Account detais :-");
		System.out.println("account id : "+accId);
		System.out.println("account holder name : "+accHolderName);
		System.out.println("account id : "+accBalance);
	}
	
	public void calculatenterest()
	{
		System.out.println("Interest is calculated here...");
	}
}
