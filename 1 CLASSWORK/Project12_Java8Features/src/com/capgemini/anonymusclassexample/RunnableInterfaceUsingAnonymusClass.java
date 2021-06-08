package com.capgemini.anonymusclassexample;

public class RunnableInterfaceUsingAnonymusClass {
	public static void main(String[] args) {
		
		new Thread(new Runnable() {
			@Override
			public void run()
			{
				System.out.println("Implementation of runnable functional interface using anonymous class");
				System.out.println("Run method in anonymous class");
			}
		}).start();
	}
}
