package com.takebus.service;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OrderDetail {

	private int orderDetailID;
	private int orderID;
	private int ticketID;
	
	private float price;
	private int quantity;
	private float totalPrice;
	private String isPurchased;
	private String confirmationNumber;

	public OrderDetail() {}
	public OrderDetail(int orderDetailID, int orderID, int ticketID, float price, int quantity, float totalPrice,  String isPurchased, String confirmationNumber) {	
		this.orderDetailID = orderDetailID;
		this.orderID = orderID;
		this.ticketID = ticketID;
		this.price = price;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.isPurchased = isPurchased;
		this.confirmationNumber = confirmationNumber;
	}
	
	public int getOrderDetailID() { return orderDetailID;}
	public void setOrderDetailID(int orderDetailID) {
		this.orderDetailID = orderDetailID;
	}
	
	public int getOrderID() { return orderID;}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	
	public int getTicketID() { return ticketID;}
	public void setTicketID(int ticketID) {
		this.ticketID = ticketID;
	}
	
	public float getPrice() { return price;}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public int getQuantity() { return quantity;}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public float getTotalPrice() { return totalPrice;}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public String getIsPurchased() { return isPurchased;}
	public void setIsPurchased(String isPurchased) {
		this.isPurchased = isPurchased;
	}
	
	public String getConfirmationNumber() { return confirmationNumber;}
	public void setConfirmationNumber(String confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}
}
