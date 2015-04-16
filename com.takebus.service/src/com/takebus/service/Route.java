package com.takebus.service;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Route {
	
	private int routeID;

	//private String scheduleID;

	private int departureStationID;
	private String departureTime;
	private int arrivalStationID;
	private String arrivalTime;

	private int busOperatorID;
	private float price;
	
	public Route() {}
	
	public Route(int routeID, int departureStationID, String departureTime, int arrivalStationID, String arrivalTime, int busOperatorID, float price) {
		this.routeID = routeID;
		//this.scheduleID = scheduleID;
		this.departureStationID = departureStationID;
		this.departureTime = departureTime;
		this.arrivalStationID = arrivalStationID;
		this.arrivalTime = arrivalTime;
		this.busOperatorID = busOperatorID;
		this.price = price;
	}
	
	public int getRouteID() { return routeID;}
	public void setRouteID(int routeID) {
		this.routeID = routeID;
	}
	
	public int getDepartureStationID() { return departureStationID;}
	public void setDepartureStationID(int departureStationID) {
		this.departureStationID = departureStationID;
	}
	
	public String getDepartureTime() { return departureTime;}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	
	public int getArrivalStationID() { return arrivalStationID;}
	public void setArrivalStationID(int arrivalStationID) {
		this.arrivalStationID = arrivalStationID;
	}
	
	public String getArrivalTime() { return arrivalTime;}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	
	public int getBusOperatorID() { return busOperatorID;}
	public void setBusOperatorID(int busOperatorID) {
		this.busOperatorID = busOperatorID;
	}
	
	public float getPrice() { return price;}
	public void setPrice(float price) {
		this.price = price;
	}
}
