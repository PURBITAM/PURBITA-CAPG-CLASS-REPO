package com.capgemini.multithreadingexample;

public class GCExample {
	
//	public void finalize()
//	{
//		System.out.println("Finalize method is called to make this object deleted "
//							+ "or by GC");
//	}
//	public static void main(String[] args) {
//		GCDemo gdc=new GCDemo();
//		gdc=null;
//		System.gc();
//	}
	public static void main(String[] args)   
    {   
		//GCExample obj = new GCExample();  
		GCDemo obj = new GCDemo();  
        System.out.println(obj.hashCode());   
        obj = null;   
        // calling garbage collector    
        System.gc();   
        System.out.println("end of garbage collection");   
  
    } 
	
    @Override  
    protected void finalize()   
    {   
        System.out.println("finalize method called in GCExample");   
    }     
}
