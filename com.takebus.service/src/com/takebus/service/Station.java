package com.takebus.service;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Station {
	
	private int stationID;
	private String station;
	private int cityID;
	
	public Station() {}
	
	public Station(int stationID, String station, int cityID) {
		this.stationID = stationID;
		this.station = station;
		this.cityID = cityID;
	}
	
	public int getStationID() { return stationID;}
	public void setStationID(int stationID) {
		this.stationID = stationID;
	} 
	
	public String getStation() { return station;}
	public void setStation(String station) {
		this.station = station;
	}
	
	public int getCityID() { return cityID;}
	public void setCityID(int cityID) {
		this.cityID = cityID;
	}
}
