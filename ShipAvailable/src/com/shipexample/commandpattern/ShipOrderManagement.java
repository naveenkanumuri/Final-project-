package com.shipexample.commandpattern;

public class ShipOrderManagement {

	public static void main(String[] args) {
		ShipBook s1 = new ShipBook();
		ShipBook s2 = new ShipBook();
		
		AcceptOrder aOrder = new AcceptOrder(s1);
		CancelOrder cOrder = new CancelOrder(s2);
		
		BookingAgent agent = new BookingAgent();
		agent.addOrders(aOrder);
		agent.addOrders(cOrder);
		
		agent.processOrders();
		
	}

}
