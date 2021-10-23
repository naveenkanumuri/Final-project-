package com.shipexample.facadepattern;

public class ShipChooserMain {

	public static void main(String[] args) {
		
		ShipFacade shipChooser = new ShipFacade();
		shipChooser.showShipOne();
		shipChooser.showShipTwo();

	}

}
