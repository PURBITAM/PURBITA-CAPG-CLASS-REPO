package com.capgemini.collectionexamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class HashSetDemo 
{
	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		int a=20;
		hs.add(a);
//		ArrayList<Character> al=new ArrayList<Character>();
//		LinkedList<Float> ll=new LinkedList<Float>();
//		ArrayList<Student> al1=new ArrayList<Student>();

//		hs.add(123);
//		hs.add(234);
//		hs.add(null);
//		hs.add(123);
//		hs.add(2341);
//		hs.add(2324);
//		System.out.println(hs);
		
		Iterator<Integer> itr = hs.iterator();
		System.out.println("HashSet values using Iterator");
		while(itr.hasNext()) {
			System.out.println(itr.next());
			System.out.println();
		}
		
		HashSet<String> flowerList = new HashSet<String>(8,0.60f);
		//capacity = 8
		//load factor  = 0.6 means if hash set is filled by 60% then the size of hash set will be doubled
		flowerList.add("Rose");
		flowerList.add("Jasmine");
		flowerList.add("Marigold");
		
		
		//adding Student objects in to hash set
		HashSet<Student> stdList = new HashSet<Student>();
		Student  std;
			Scanner sc= new Scanner(System.in);
			for(int i=0;i<3;i++) {
				System.out.println("Enter the details of Student");
				System.out.println("Enter the Student id");
				int id = sc.nextInt();
				System.out.println("Enter the Student Name");
				String name = sc.next();
				stdList.add(new Student(id,name));
			}
			
			Iterator<Student> stuItr = stdList.iterator();
			System.out.println("Student HashSet values using Iterator");
			while(stuItr.hasNext()) {
				Student st = stuItr.next();
				System.out.println(st.getSname() + " \t\t\t " + st.getSid());
				System.out.println();
			}
			
			System.out.println("Enter the student id to be removed : ");
			int id=sc.nextInt();
			while(stuItr.hasNext())
			{
				Student st=stuItr.next();
				if(st.getSid()==id)
				{
					stuItr.remove();
				}
			}
			
			while(stuItr.hasNext()) {
				Student st = stuItr.next();
				System.out.println(st.getSname() + " \t\t\t " + st.getSid());
				System.out.println();
			}
		
	}
}
