package com.takebus.service;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Order {

	private int orderID;
	private int customerID;

	
	private String orderDate;
	float discount;
	
	public Order() {}
	
	public Order(int orderID, int customerID, String orderDate) {
		this.orderID = orderID;
		this.customerID = customerID;
		this.orderDate = orderDate;
	}
	
	public int getOrderID() { return orderID;}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	
	public int getCustomerID() { return customerID;}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	
	public String getOrderDate() { return orderDate;}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
}
