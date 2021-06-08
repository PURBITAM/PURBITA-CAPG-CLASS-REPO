package com.capgemini.collectionexamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo 
{
	public static void main(String[] args) {
		ArrayList<Character> alphabets=new ArrayList<Character>();
		alphabets.add('A');
		alphabets.add('B');
		alphabets.add('C');
		alphabets.add('D');
		alphabets.add('E');
		alphabets.add(null);
		alphabets.add(null);
		
		System.out.println(alphabets);
		
		System.out.println("arraylist values using for-each loop");
		for(Character al:alphabets)
		{
			System.out.print(al+" ");
		}
		System.out.println();
		//using for loop
		System.out.println("arraylist values using for loop");
		for(int i=0;i<alphabets.size();i++)
		{
			System.out.println(alphabets.get(i));
		}
		
		//using iterator
		System.out.println("arraylist values using iterator");
		Iterator<Character> chitr=alphabets.iterator();
		while(chitr.hasNext())
		{
			System.out.println(chitr.next());
		}
		
		//using list iterator
		System.out.println("arraylist values using Listiterator in forward direction");
		ListIterator<Character> chLitrf=alphabets.listIterator();
		while(chLitrf.hasNext())
		{
			System.out.println(chLitrf.next());
		}
		
		System.out.println("arraylist values using Listiterator in backward direction");
		//ListIterator<Character> chLitrf=alphabets.listIterator();
		while(chLitrf.hasPrevious())
		{
			System.out.println(chLitrf.previous());
		}
		
		ArrayList<Character> alphabets1=new ArrayList<Character>();
		alphabets.add('A');
		alphabets.add('B');
		alphabets.add('C');
		alphabets.add('D');
		alphabets.add('E');
		
		
	}
}
