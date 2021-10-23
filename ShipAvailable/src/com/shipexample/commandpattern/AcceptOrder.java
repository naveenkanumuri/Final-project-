package com.shipexample.commandpattern;

public class AcceptOrder implements Ship{
	private ShipBook shipOrder;
	
	public AcceptOrder(ShipBook ship) {
		
		this.shipOrder = ship;
	}

	

	@Override
	public void processOrder() {
		shipOrder.accept();
		
	}
}
