package com.capgemini.service;

import java.util.Comparator;

import com.capgemini.model.Product;

public class ProductPriceComperator  implements Comparator<Product>
{

	@Override
	public int compare(Product p1, Product p2) {
		if(p1.getPrice()==p2.getPrice())
		{
			return 0;
		}
		else if(p1.getPrice()>p2.getPrice())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}
