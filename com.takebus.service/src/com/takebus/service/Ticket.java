package com.takebus.service;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Ticket {
	private int ticketID;
	private int routeID;

	private String holderName;
	
	private String ticketDate;

	private String ticketType;
	private String barcode;
	private float price;
	
	public Ticket() {}
	public Ticket(int ticketID, int routeID, String holderName, String ticketDate, String ticketType, String barcode, float price) {
		this.ticketID = ticketID;
		this.routeID = routeID;
		this.holderName = holderName;
		this.ticketDate = ticketDate;
		this.ticketType = ticketType;
		this.barcode = barcode;
		this.price = price;
	}
	
	public int getTicketID() { return ticketID;}
	public void setTicketID(int ticketID) {
		this.ticketID = ticketID;
	}
	
	public int getRouteID() { return routeID;}
	public void setRouteID(int routeID) {
		this.routeID = routeID;
	}
	
	public String getHolderName() { return holderName;}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	
	public String getTicketDate() { return ticketDate;}
	public void setTicketDate(String ticketDate) {
		this.ticketDate = ticketDate;
	}
	
	public String getTicketType() { return ticketType;}
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}
	
	public String getBarcode() { return barcode;}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	
	public float getPrice() { return price;}
	public void setPrice(float price) {
		this.price = price;
	}
}
