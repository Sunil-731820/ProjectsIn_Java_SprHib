package com.java.spr;

import java.util.List;

public class OrderLogic {
	private List<Order> items;

	public List<Order> getItems() {
		return items;
	}

	public void setItems(List<Order> items) {
		this.items = items;
	}
	
	
	public void display() {
		for(Order order:items) {
			order.display();
			int value = order.getObjProduct().getQuantityAvail()-order.getQtyord();
			if(value>=0) {
				System.out.println("Order placed Successfully");
				System.out.println("Bill Amount " + order.getQtyord()*order.getObjProduct().getPrice());
			}else {
				System.out.println("Availibility is Low \n");
				System.out.println("So Order can be placed \n");
			}
		}
	}

}
