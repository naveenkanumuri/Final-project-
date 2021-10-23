package com.shipexample.facadepattern;

public class ShipFacade {
	private Ship s1;
	private Ship s2;
	public ShipFacade() {
		s1 = new Cruise();
		s2 = new Yatch();
	}
	public void showShipOne() {
		s1.showShip();
	}
	public void showShipTwo() {
		s2.showShip();
	}

}
