package com.takebus.service;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BusOperator {
	
	private int busOperatorID;
	private String busOperator;
	
	public BusOperator() {}
	
	public BusOperator(int busOperatorID, String busOperator) {
		this.busOperatorID = busOperatorID;
		this.busOperator = busOperator;
	}
	
	public int getBusOperatorID() { return busOperatorID;}
	public void setBusOperatorID(int busOperatorID) {
		this.busOperatorID = busOperatorID;
	}
	
	public String getBusOperator() { return busOperator;}
	public void setBusOperator(String busOperator) {
		this.busOperator = busOperator;
	}
}
