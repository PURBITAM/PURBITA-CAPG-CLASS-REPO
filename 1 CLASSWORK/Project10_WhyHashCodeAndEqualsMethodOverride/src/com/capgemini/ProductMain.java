package com.capgemini;

import java.util.ArrayList;

import com.capgemini.service.ProductManager;

public class ProductMain 
{
	public static void main(String[] args) 
	{
		ProductManager pm=new ProductManager();
		pm.createProduct();
		pm.compareProducts();
	
/** Wrapper class has already overridden hashcode and equals method*/
		
//		ArrayList<String> names=new ArrayList<String>();
//		names.add("Rama");
//		names.add("Rama");
//		
//		if(names.get(0).equals(names.get(1)))
//		{
//			System.out.println("Strings are equal");
//		}
//		else
//		{
//			System.out.println("Strings  are not equal");
//		}
		pm.sortProduct();
		pm.sortProductUsingProductID();
		pm.sortProductUsingName();
	}
}
