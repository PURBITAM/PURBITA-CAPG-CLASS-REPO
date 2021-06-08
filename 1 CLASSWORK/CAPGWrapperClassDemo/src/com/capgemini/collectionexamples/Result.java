package com.capgemini.collectionexamples;

public class Result extends Student
{
	String result;
	
	public Result() {
		super();
	}

	public Result(String result) 
	{
		super();
		this.result = result;
	}
	
	public Result(int sid, String sname, float marks) {
		super(sid, sname, marks);
		// TODO Auto-generated constructor stub
	}

	public String announceResult()
	{
		float marks=getMarks();
		if(marks>80)
		{
			return ("Distinction");
		}
		else if((marks>60)&&(marks<=80))
		{
			return ("FristClass");
		}
		else
		{
			return ("Pass");
		}
	}

	
}
