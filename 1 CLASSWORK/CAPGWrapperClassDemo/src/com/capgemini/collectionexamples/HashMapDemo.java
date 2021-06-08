package com.capgemini.collectionexamples;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import javax.security.auth.callback.LanguageCallback;

public class HashMapDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashMap<String,Integer> languages=new HashMap<String, Integer>();
		languages.put("Java",17);
		languages.put("JavaScript",6);
		
		//collision below
		languages.put("Python",3);
		languages.put("Python",7);
		languages.put("C",3);
		languages.put("C++",7);
		
		
		System.out.println("HashMap values = "+languages);
		
		//get() method for accessing value
		int value=languages.get("Java");
		System.out.println("Value in the HashMap with key 'Java' = "+value);
		
		//set the keys from the above HashMap
		Set<String> languagesKeySet=languages.keySet();
		System.out.println("Key values of above HashMap : "+languagesKeySet);
		
		//set of values from the above HashMap
		Collection<Integer> languagesValueSet =languages.values();
		System.out.println("Values of the above HashMap : "+languagesValueSet);
		
		//key,values from the above HashMap using entrySet() method
		Set<Entry<String,Integer>> languagesKeyValueSet =languages.entrySet();
		System.out.println("Key and Values of the above HashMap : "+languagesKeyValueSet);
		
		//replace a HashMap
		languages.replace("Java",9);
		System.out.println("Key and Values of the above HashMap after replace : "+languagesKeyValueSet);
		
//===========================================================================		
		//Iterate through a HashMap
		//iterating through the keyset using keySet() method
		System.out.print("Keys = ");
		for(String key : languages.keySet())
		{
			System.out.print(key);
			System.out.print(",");
			
		}
		System.out.println();
		System.out.print("key using KeySet : ");
		for(String key : languagesKeySet)
		{
			System.out.print(key);
			System.out.print(",");
		}
		System.out.println();
		
//===========================================================================		
		//Iterate through a HashMap
		//iterating through the values using Values() method
		System.out.print("Keys = ");
		for(Integer values : languages.values())
		{
			System.out.print(values);
			System.out.print(",");
		}
		System.out.println();
		System.out.print("key using HashSet : ");
		for(Integer values : languagesValueSet)
		{
			System.out.print(values);
			System.out.print(",");
		}
		System.out.println();
		
//===========================================================================		
		//Iterate through a HashMap
		//iterating through the key,values using entrySet() method
		System.out.print("Keys,value using EntrySet = ");
		for(Entry<String,Integer> hasmapdata : languages.entrySet())
		{
			System.out.print(hasmapdata);
			System.out.print(",");
		}
		System.out.println();
		System.out.print("key using set : ");
		for(Entry<String,Integer> hasmapdata : languagesKeyValueSet)
		{
			System.out.print(hasmapdata);
			System.out.print(",");
		}
		System.out.println();
		
//===========================================================================
		
		//converting HashMap to treeMap to sort the values
		
	}

}
