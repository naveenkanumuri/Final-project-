package com.shipexample.adapterpattern;

public class TicketChecker implements GroupTicket{
	
	TicketCheckerAdapter tktChkAdap;

	@Override
	public void getTicketDetails(String ticketType, String name) {
		
		if(ticketType.equalsIgnoreCase("Single")){
	         System.out.println("Person: "+name+" has booked ticket type: " + ticketType);			
	      } 
	      
	      
	      else if(ticketType.equalsIgnoreCase("Group") || name.equalsIgnoreCase("Jack")){
	    	  tktChkAdap = new TicketCheckerAdapter(ticketType);
	    	  tktChkAdap.getTicketDetails(ticketType, name);
	      }
	      
	      else{
	         System.out.println("Invalid Ticket type " + ticketType);
	      }
		
	}

}
