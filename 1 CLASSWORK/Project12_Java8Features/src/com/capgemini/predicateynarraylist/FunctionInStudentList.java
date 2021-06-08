package com.capgemini.predicateynarraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionInStudentList {
	public static void main(String[] args) {
		List<Student> stdList=new ArrayList<Student>();
		stdList.add(new Student(121,"Rama"));
		stdList.add(new Student(122,"Ramaji"));
		stdList.add(new Student(123,"Krishna"));
		
		Function<Student,String> funcStdToString=(Student s)->{return s.getStudentName();};
		Function<String,String> subStr=(String s)->s.substring(0,1);
		List<String> studentNameInitials=convertStudentNameListToNamesList(stdList,funcStdToString.andThen(subStr));
		
		System.out.print("Student Name Initials =");
		studentNameInitials.forEach(str->{System.out.print(" "+str);});
//		System.out.println();
//		stdList.forEach(str->{System.out.print(" "+str);});
	}

	public static List<String> convertStudentNameListToNamesList(List<Student> stdList, Function<Student,String> subStr)
	{
		List<String> stdNameList=new ArrayList<String>();
		for(Student s:stdList)
		{
			stdNameList.add(subStr.apply(s));
		}
		return stdNameList;
		
	}
}
