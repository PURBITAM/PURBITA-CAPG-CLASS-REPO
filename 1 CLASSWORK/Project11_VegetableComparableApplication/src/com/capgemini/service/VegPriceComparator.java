package com.capgemini.service;

import java.util.Comparator;

import com.capgemini.model.Vegetable;

public class VegPriceComparator implements Comparator<Vegetable>
{

	@Override
	public int compare(Vegetable p1, Vegetable p2) {
		if(p1.getVegPrice()==p2.getVegPrice())
		{
			return 0;
		}
		else if(p1.getVegPrice()>p2.getVegPrice())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}
