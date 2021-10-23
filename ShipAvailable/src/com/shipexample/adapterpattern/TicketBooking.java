package com.shipexample.adapterpattern;

public class TicketBooking implements SingleTicket{

	@Override
	public void checkShipAvailability(String name) {
		System.out.println("Checking Ship availability to bbok ticket for "+name);
		
	}

	@Override
	public void checkPrice(String name) {
		
		
	}

}
