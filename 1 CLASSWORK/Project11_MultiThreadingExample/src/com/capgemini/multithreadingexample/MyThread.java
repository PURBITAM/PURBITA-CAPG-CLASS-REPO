package com.capgemini.multithreadingexample;

public class MyThread implements Runnable{

	String name;
	Thread t;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=5;i>0;i--)
		{
			System.out.println(name+" : "+i);
			System.out.println("==========================");
		}
		
	}
	
	public MyThread(String threadname)
	{
		name=threadname;
		t=new Thread(this,name); // naming of thread
		System.out.println("New Thread: "+t);
		System.out.println("==========================");
		t.start();
		System.out.println("hiii");
	}
}
