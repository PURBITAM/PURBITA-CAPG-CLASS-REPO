package com.capgemini.classexample;

public class StringExamples 
{
	String str="abcd";
	String strObj=new String();
	char[] name= {'a','z','m'};
	String nameObj=new String(name);
	public void printStringValues()
	{
		System.out.println(str);
	}
	public void printStringConstant()
	{
		System.out.println(str.hashCode());
		str="qwe";
		System.out.println("after changing value of string : "+str.hashCode());
	}
}
