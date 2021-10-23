package com.shipexample.adapterpattern;

public class TicketCheckerAdapter implements GroupTicket{
	
	SingleTicket sticket;
	
	public TicketCheckerAdapter(String ticketType) {
		if(ticketType.equalsIgnoreCase("Single")) {
			sticket = new GetTicketPrice();
		}else if(ticketType.equalsIgnoreCase("Group")) {
			sticket = new TicketBooking();
		}
	}
	
	@Override
	public void getTicketDetails(String ticketType, String name) {
		if(ticketType.equalsIgnoreCase("Group")) {
			sticket.checkPrice(name);
		}else if(ticketType.equalsIgnoreCase("Single")) {
			sticket.checkShipAvailability(name);
		}
		
	}

}
