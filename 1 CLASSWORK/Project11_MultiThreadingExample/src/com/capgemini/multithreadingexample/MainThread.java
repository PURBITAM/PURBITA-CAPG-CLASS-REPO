package com.capgemini.multithreadingexample;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyThread("Thread One");
		new MyThread("Thread Two");
		new MyThread("Thread Three");
		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Main thread exiting .....");
	}

}
