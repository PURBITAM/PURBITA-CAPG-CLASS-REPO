package com.capgemini.model;

import java.util.Collections;

import com.capgemini.service.VegIdComparator;

public class Vegetable implements Comparable<Vegetable>{
	
	private int vegId;
	private String vegname;
	private double vegPrice;
	
	
	public Vegetable() {
		super();
	}

	
	public Vegetable(int vegId, String vegname, double vegPrice) {
		super();
		this.vegId = vegId;
		this.vegname = vegname;
		this.vegPrice = vegPrice;
	}


	public int getVegId() {
		return vegId;
	}


	public void setVegId(int vegId) {
		this.vegId = vegId;
	}


	public String getVegname() {
		return vegname;
	}


	public void setVegname(String vegname) {
		this.vegname = vegname;
	}


	public double getVegPrice() {
		return vegPrice;
	}


	public void setVegPrice(double vegPrice) {
		this.vegPrice = vegPrice;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + vegId;
		long temp;
		temp = Double.doubleToLongBits(vegPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((vegname == null) ? 0 : vegname.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vegetable other = (Vegetable) obj;
		if (vegId != other.vegId)
			return false;
		if (Double.doubleToLongBits(vegPrice) != Double.doubleToLongBits(other.vegPrice))
			return false;
		if (vegname == null) {
			if (other.vegname != null)
				return false;
		} else if (!vegname.equals(other.vegname))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Vegetable veg1)
	{
		return vegname.compareTo(veg1.vegname);
	}
}
