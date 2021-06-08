package com.capgemini.anonymusclassexample;

public class AnonymusClassExample {
	public static void main(String[] args) {
		Shape s=new Shape() {
								int height = 30;
								void perimeter()
								{
									System.out.println("Shape perimeter : "+(2*(length+height)));
		
								}
								
								void area()
								{
									System.out.println("Shape area");
									System.out.println("Length : "+length);
								}
							};
		s.area();
		s.perimeter();
		System.out.println();
		Vehicle v=new Vehicle() {
									int cost=3000;

									@Override
									public void costOfVehicle() {
										// TODO Auto-generated method stub
										System.out.println("cost of vehicle : "+cost);
										
									}
						
									@Override
									public void typeOfVehicle() {
										// TODO Auto-generated method stub
										System.out.println("type of vehicle");
										
									}
									
								};
		v.costOfVehicle();
		v.typeOfVehicle();
	}
}
