Adapter Design Pattern - 
I have created Adapter design pattern where GroupTicket and SingleTicket are the Interfaces, TicketBooking and GetTicketPrice are concrete classes, TicketCheckerAdapter is adapter class implementing the GroupTicket interface. My main class is ShipAvailabilityMain.

Command Design Pattern - 
I have created Command Design Pattern where Ship is the interface, ShipBook is the request class, AcceptOrder and CancelOrder is a concrete class implements Ship, BookingAgent is the broker class. The ShipOrderManagement is the main class. In result we can see if the ship are booked or cancelled.

Facade Design Pattern - 
I have created ShipChooserMain as the main class, Ship as interface, Ferry, Yatch and cruise are concrete classes implementing the same interface and ShipFacade as facade class.

Factory Design Pattern - 
I have created ShipTypeMain as the main class, Ship as interface, Ferry, Yatch and cruise as concrete classes implementing the same interface and ShipFactory as factory class to generate object of concrete class.