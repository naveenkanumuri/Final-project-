package com.shipexample.adapterpattern;

public class GetTicketPrice implements SingleTicket{

	@Override
	public void checkShipAvailability(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkPrice(String name) {
		System.out.println("The Ticket price for "+name+" is $20");
		
	}

}
