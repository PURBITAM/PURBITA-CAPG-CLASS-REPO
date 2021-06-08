package com.capgemini.predicateynarraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInStudentArrayList 
{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> stdList=new ArrayList<Student>();
		stdList.add(new Student(121,"Rama"));
		stdList.add(new Student(122,"Ramaji"));
		stdList.add(new Student(123,"Krishna"));
		
		List nameStartsWithR=filterByName(stdList,(Student s)->s.getStudentName().startsWith("R"));
		System.out.println(nameStartsWithR);
	}

	private static List filterByName(List<Student> stdList, Predicate<Student> pred) {
		List<Student> resultList=new ArrayList<Student>();
		for(Student s:stdList)
		{
			if(pred.test(s))
			{
				resultList.add(s);
			}
		}
		return resultList;
	}

}
