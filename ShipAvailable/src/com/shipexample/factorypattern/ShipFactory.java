package com.shipexample.factorypattern;

public class ShipFactory {
	public Ship getSubject(String subj) {
		if (subj.equals("Yatch")) {
			return new Yatch();
		}
		if (subj.equals("Ferry")) {
			return new Ferry();
		}
		if (subj.equals("Cruise")) {
			return new Cruise();
		} else {
			return null;
		}
	}
}
