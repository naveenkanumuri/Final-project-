package com.shipexample.commandpattern;

public class ShipBook {
	
	public ShipBook() {
		super();
	}
	public void accept() {
		System.out.println("The ship booking Order is placed");
	}
	public void cancel() {
		System.out.println("The ship booking Order is cancelled");
	}
}
