package com.capgemini.multithreadingexample;

public class GCDemo {

	public GCDemo() {
		System.out.println("Demo default constructor");
	}
	@Override  
    protected void finalize()   
    {   
        System.out.println("finalize method called in GCDemo");   
    }
}
