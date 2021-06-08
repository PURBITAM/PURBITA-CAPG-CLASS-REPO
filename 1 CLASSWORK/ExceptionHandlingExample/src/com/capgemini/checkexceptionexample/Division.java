package com.capgemini.checkexceptionexample;

public class Division 
{
	public void divide(){
		try
		{
			int result=10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception = "+e.getMessage());
		}
		catch(Exception e) // this is mostly used (me) at the end, will be the super class
		{
			e.printStackTrace();
			System.out.println("=====================================");
			System.out.println("Arithmetic Exception = "+e.getMessage());
		}
		finally
		{
			//will be executed in both cases while exception or no exception
			//finally block is used to close the connections
			//file close,db,close,scanner close etc.,
			System.out.println("Finally block that execute in both cases");
		}
	}
}
