package com.capgemini.lambdaexpressionexamples;

@FunctionalInterface
public interface Substraction {
	public int sub();
	
	//in interface, default and static methods can't be abstract
	default void readValue()
	{
		System.out.println("read value");
	}
	
	static void display()
	{
		System.out.println("Display");
	}
	
	static void display1()
	{
		System.out.println("Display");
	}
}
