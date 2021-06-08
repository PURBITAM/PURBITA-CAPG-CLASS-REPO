package com.capgemini.service;

import java.util.ArrayList;
import java.util.Collections;

import com.capgemini.model.Product;

public class ProductManager 
{
	ArrayList<Product> productList=new ArrayList<Product>();
	
	public void createProduct()
	{
		Product p=new Product(1234,"Pen",35);
		Product p1=new Product(1235,"Eraser",25);
		productList.add(p);
		productList.add(p1);
	}
	
	public void compareProducts()
	{
		if(productList.get(0).equals(productList.get(1)))
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("both are not equal");
		}
	}
	
	public void sortProduct()
	{	
		Collections.sort(productList);
		for(int i=0;i<productList.size();i++)
		{
			System.out.println(productList.get(i).getPid()+" "+productList.get(i).getPname()+" "+productList.get(i).getPrice());
		}
	}
	
	public void sortProductUsingProductID()
	{
		Collections.sort(productList,new ProductIDComperator());
		System.out.println("sort by id");
		for(int i=0;i<productList.size();i++)
		{
			System.out.println(productList.get(i).getPid()+" "+productList.get(i).getPname()+" "+productList.get(i).getPrice());
		}
	}
	
	public void sortProductUsingName()
	{
		Collections.sort(productList,new ProductNameComperator());
		System.out.println("sort by name");
		for(int i=0;i<productList.size();i++)
		{
			System.out.println(productList.get(i).getPid()+" "+productList.get(i).getPname()+" "+productList.get(i).getPrice());
		}
	}
	
	
}
