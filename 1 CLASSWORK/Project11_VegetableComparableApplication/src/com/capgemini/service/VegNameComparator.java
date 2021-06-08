package com.capgemini.service;

import java.util.Comparator;

import com.capgemini.model.Vegetable;

public class VegNameComparator implements Comparator<Vegetable>
{

	@Override
	public int compare(Vegetable p1, Vegetable p2) {
		return p1.getVegname().compareTo(p2.getVegname());
	}
	
}