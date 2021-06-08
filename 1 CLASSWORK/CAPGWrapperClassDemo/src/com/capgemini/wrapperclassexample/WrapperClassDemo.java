package com.capgemini.wrapperclassexample;


public class WrapperClassDemo {
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=30;
		//boxing
		Integer i=a;
		
		//unboxing
		System.out.println(Integer.valueOf(i));
		
		Float f=35.678f;
		System.out.println(Float.valueOf(f));
		
		Character ch='A';
		System.out.println(Character.valueOf(ch));
		System.out.println((int)ch.charValue()); //type casting
		
		
	}

}
