package com.shipexample.commandpattern;

public class CancelOrder implements Ship {
	private ShipBook shipOrder;
	
	public CancelOrder(ShipBook ship) {
		
		this.shipOrder = ship;
	}

	

	@Override
	public void processOrder() {
		this.shipOrder.cancel();;
		
	}
}
