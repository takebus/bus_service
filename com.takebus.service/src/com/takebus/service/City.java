package com.takebus.service;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class City {
	
	private int cityID;
	private String city;
	private String state;
	private String zipCode;
	private String country;
	
	public City() {}
	
	public City(int cityID, String city, String state, String zipCode, String country) {
		this.cityID = cityID;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.country = country;
	}
	
	public int getCityID() { return cityID;}
	public void setCityID(int cityID) {
		this.cityID = cityID;
	} 
	
	public String getCity() { return city;}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() { return state;}
	public void setState(String state) {
		this.state = state;
	}
	
	public String getZipCode() { return zipCode;}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public String getCountry() { return country;}
	public void setCountry(String country) {
		this.country = country;
	}
}

