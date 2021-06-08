package com.capgemini.interfaceexample;

import java.util.Scanner;

public class MainInterface 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = 'y';
		SavingsAccount sa = new SavingsAccount();
		while (ch == 'y') {
			System.out.println("Enter the choice");
			System.out.println("addMoney");
			System.out.println("withDrawMoney");
			System.out.println("CheckBal");
			String option = sc.next();
			switch (option) {
			case "addMoney":
				sa.addMoney();
				break;
			default:
				System.out.println("Not valid option");

			}// switch close
			System.out.println("do you want to continue");
			ch = sc.next().trim().charAt(0);
		} 
	}
}
