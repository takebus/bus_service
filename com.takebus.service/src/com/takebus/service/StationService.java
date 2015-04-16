package com.takebus.service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/station")
public class StationService {
	HashMap<String, List<Station>> hmap;
	HashMap<String, List<Station>> hmap2;
	private List<Station> stations;
	
	public StationService() {
		Station s1 = new Station(1, "1400 Washington Ave", 1);
		Station s2 = new Station(2, "217 Central Ave", 1);
		
		Station s3 = new Station(3, "888 6th Ave", 2);
		Station s4 = new Station(4, "3 Allen St", 2);
		
		Station s5 = new Station(5, "900 State street", 3);
		
		stations = new LinkedList<Station>();
		stations.add(s1);
		stations.add(s2);
		stations.add(s3);
		stations.add(s4);
		stations.add(s5);
		
		hmap = new HashMap<String, List<Station>>();
		List<Station> ss1 = new LinkedList<Station>();
		ss1.add(s1);
		List<Station> ss2 = new LinkedList<Station>();
		ss2.add(s2);
		List<Station> ss3 = new LinkedList<Station>();
		ss3.add(s3);
		hmap.put("1", ss1);
		hmap.put("2", ss2);
		hmap.put("3", ss3);
		
		hmap2 = new HashMap<String, List<Station>>();
		List<Station> c1 = new LinkedList<Station>();
		c1.add(s1);
		c1.add(s2);
		hmap2.put("Albany,NY", c1);
		
		List<Station> c2 = new LinkedList<Station>();
		c2.add(s3);
		c2.add(s4);
		hmap2.put("New York,NY", c2);
		
		List<Station> c3 = new LinkedList<Station>();
		c3.add(s5);
		hmap2.put("Schenectady,NY", c3);
	}

	@GET
	@Path("/xml")
	@Produces (MediaType.APPLICATION_XML)
	public List<Station> getStationsXML() {
		if (stations.size() > 0) {
			return stations;
		}
		else return null;
	}	
	
	@GET
	@Path("/json")
	@Produces(MediaType.APPLICATION_JSON)	
	public List<Station> getStationsJson() {
		if (stations.size() > 0) {
			return stations;
		}
		else return null;
	}	
	
	@GET
	@Path("/id/xml/{name}")
	@Produces (MediaType.APPLICATION_XML)
	public List<Station> getStationBystationIDXML(@PathParam("name") String name) {
		if(hmap.containsKey(name)) {
			
			return hmap.get(name);
		}
		else return null;
	}	
	
	@GET
	@Path("/id/json/{name}")
	@Produces(MediaType.APPLICATION_JSON)	
	public List<Station> getStationBystationIDJson(@PathParam("name") String name) {
		if(hmap.containsKey(name)) {
			return hmap.get(name);
		}
		else return null;
	}

	@GET
	@Path("/city/xml/{name}")
	@Produces (MediaType.APPLICATION_XML)
	public List<Station> getStationByCityXML(@PathParam("name") String name) {
		if(hmap2.containsKey(name)) {
			
			return hmap2.get(name);
		}
		else return null;
	}	
	
	@GET
	@Path("/city/json/{name}")
	@Produces(MediaType.APPLICATION_JSON)	
	public List<Station> getStationByCityJson(@PathParam("name") String name) {
		if(hmap2.containsKey(name)) {
			return hmap2.get(name);
		}
		else return null;
	}	
}
