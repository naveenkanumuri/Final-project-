package com.shipexample.factorypattern;

public class Ferry implements Ship{
	
	
	
	public Ferry() {
		super();
	}

	@Override
	public void showShip() {
		System.out.println("You have chosen a Ferry");
	}

}
