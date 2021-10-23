package com.shipexample.commandpattern;

import java.util.ArrayList;
import java.util.List;

public class BookingAgent {
	private List<Ship> orderList = new ArrayList<Ship>();
	
	public void addOrders(Ship order) {
		orderList.add(order);
	}
	public void processOrders() {
		for(Ship order: orderList) {
			order.processOrder();
		}
		orderList.clear();
	}
}
