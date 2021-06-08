package com.capgemini.service;

import java.util.Comparator;

import com.capgemini.model.Vegetable;

public class VegIdComparator implements Comparator<Vegetable>
{

	@Override
	public int compare(Vegetable p1, Vegetable p2) {
		if(p1.getVegId()==p2.getVegId())
		{
			return 0;
		}
		else if(p1.getVegId()>p2.getVegId())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}