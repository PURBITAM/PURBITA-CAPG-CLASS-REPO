package com.capgemini.service;

import java.util.Comparator;

import com.capgemini.model.Product;

public class ProductNameComperator implements Comparator<Product>
{

	@Override
	public int compare(Product p1, Product p2) {
		return p1.getPname().compareTo(p2.getPname());
	}
	
}