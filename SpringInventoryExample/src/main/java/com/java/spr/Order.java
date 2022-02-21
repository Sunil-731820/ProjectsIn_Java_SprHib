package com.java.spr;

public class Order {
	private int qtyord;
	private int orderId;
	private Product objProduct;
	
	public int getOrderId() {
		return orderId;
	}
	
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	public Product getObjProduct() {
		return objProduct;
	}
	
	public void setObjProduct(Product objProduct) {
		this.objProduct = objProduct;
	}
	

	public int getQtyord() {
		return qtyord;
	}

	public void setQtyord(int qtyord) {
		this.qtyord = qtyord;
	}
	
	public void display() {
		System.out.println("Quantity Ordered" + qtyord + "Order Id " + orderId);
		System.out.println(objProduct);
	}

}
