package com.capgemini.streamapijava8;

import java.util.ArrayList;
import java.util.List;

public class StreamAPIExample {
	
	public static List<String> getPlaces()
	{
		List<String> countriesPlaces = new ArrayList<String>();
		countriesPlaces.add("Nepal,Katmandu");
		countriesPlaces.add("Nepal,Abc");
		countriesPlaces.add("Orissa,Puri");
		countriesPlaces.add("Kolkata,New Town");
		countriesPlaces.add("USA,New York");
		countriesPlaces.add("Africa,Nigeria");
		
		return countriesPlaces;
	}
	public static void main(String[] args) {
		List<String> area = getPlaces();
		System.out.println("Places in Nepal : ");
		area
		.stream()
		.filter((p)->p.startsWith("Nepal"))
		.map((p)->p.toUpperCase())
		.sorted()
		.forEach((p)->System.out.println(p));
	}
}
