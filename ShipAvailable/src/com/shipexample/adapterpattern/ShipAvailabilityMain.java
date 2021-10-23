package com.shipexample.adapterpattern;

public class ShipAvailabilityMain {

	public static void main(String[] args) {
		TicketChecker check = new TicketChecker();
		check.getTicketDetails("Group", "Mark");
		check.getTicketDetails("Single", "Eric");
	}

}
