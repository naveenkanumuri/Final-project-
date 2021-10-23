package com.shipexample.factorypattern;

public class ShipTypeMain {

	public static void main(String[] args) {
		ShipFactory shipFactory = new ShipFactory();
		Ship subj1 = shipFactory.getSubject("Ferry");
		subj1.showShip();
		Ship subj2 = shipFactory.getSubject("Cruise");
		subj2.showShip();
		Ship subj3 = shipFactory.getSubject("Yatch");
		subj3.showShip();
	}

}
