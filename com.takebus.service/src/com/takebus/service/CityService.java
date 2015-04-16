package com.takebus.service;

import java.util.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/city")
public class CityService {
	HashMap<String, List<City>> hmap;
	HashMap<String, List<City>> hmap2;
	private List<City> cities;
	
	public CityService() {
		City c1 = new City(1, "Albany", "NY", "12201", "US");
		City c2 = new City(2, "New York", "NY", "10001", "US");
		City c3 = new City(3, "Schenectady", "NY", "12301", "US");
		
		cities = new LinkedList<City>();
		cities.add(c1);
		cities.add(c2);
		cities.add(c3);
		
		hmap = new HashMap<String, List<City>>();
		List<City> cs1 = new LinkedList<City>();
		cs1.add(c1);
		List<City> cs2 = new LinkedList<City>();
		cs2.add(c2);
		List<City> cs3 = new LinkedList<City>();
		cs3.add(c3);
		
		hmap.put("Albany,NY", cs1);
		hmap.put("New York,NY", cs2);
		hmap.put("Schenectady,NY", cs3);
		
		hmap2 = new HashMap<String, List<City>>();
		
		hmap2.put("1", cs1);
		hmap2.put("2", cs2);
		hmap2.put("3", cs3);
	}
	
	@GET
	@Path("/xml")
	@Produces (MediaType.APPLICATION_XML)
	public List<City> getCitiesXML() {
		if (cities.size() > 0) {
			return cities;
		}
		else return null;
	}	
	
	@GET
	@Path("/json")
	@Produces(MediaType.APPLICATION_JSON)	
	public List<City> getCitiesJson() {
		if (cities.size() > 0) {
			return cities;
		}
		else return null;
	}	
	
	@GET
	@Path("/xml/{name}")
	@Produces (MediaType.APPLICATION_XML)
	public List<City> getCityByNameXML(@PathParam("name") String name) {
		if(hmap.containsKey(name)) {
			
			return hmap.get(name);
		}
		else return null;
	}	
	
	@GET
	@Path("/json/{name}")
	@Produces(MediaType.APPLICATION_JSON)	
	public List<City> getCityByNameJson(@PathParam("name") String name) {
		if(hmap.containsKey(name)) {
			
			return hmap.get(name);
		}
		else return null;
	}

	@GET
	@Path("/id/xml/{name}")
	@Produces (MediaType.APPLICATION_XML)
	public List<City> getCityByIDXML(@PathParam("name") String name) {
		if(hmap2.containsKey(name)) {
			
			return hmap2.get(name);
		}
		else return null;
	}	
	
	@GET
	@Path("/id/json/{name}")
	@Produces(MediaType.APPLICATION_JSON)	
	public List<City> getCityByIDJson(@PathParam("name") String name) {
		if(hmap2.containsKey(name)) {
			
			return hmap2.get(name);
		}
		else return null;
	}
}
