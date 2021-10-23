package com.shipexample.facadepattern;

public class Cruise implements Ship{
	
	
	
	public Cruise() {
		super();
	}

	@Override
	public void showShip() {
		System.out.println("You have chosen a Cruise Ship");
	}
	

}
