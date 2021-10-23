package com.shipexample.facadepattern;

public class Yatch implements Ship{
	
	
	
	public Yatch() {
		super();
	}

	@Override
	public void showShip() {
		System.out.println("You have chosen a Yatch");
	}

}
