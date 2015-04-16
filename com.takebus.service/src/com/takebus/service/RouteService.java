package com.takebus.service;


import java.util.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/route")
public class RouteService {
	List<Route> list;
	private HashMap<String, List<Route>> hmap;
	private HashMap<String, List<Route>> hmap2;
	
	public RouteService() {
		Route r1 = new Route(1, 1, "7:20am", 2, "11:00am", 1, 15);
		Route r2 = new Route(2, 1, "12:50pm", 2, "4:30pm", 1, 15);
		Route r3 = new Route(3, 1, "5:50pm", 2, "9:30pm", 1, 15);
		Route r4 = new Route(4, 1, "10:30pm", 2, "1:30am", 1, 15);
		
		Route r5 = new Route(5, 2, "8:30am", 1, "12:00pm", 1, 15);		
		Route r6 = new Route(6, 2, "1:30pm", 1, "4:30pm", 1, 15);	
		Route r7 = new Route(7, 2, "5:30pm", 1, "8:30pm", 1, 15);	
		Route r8 = new Route(8, 2, "6:30pm", 1, "9:30pm", 1, 15);
		Route r9 = new Route(9, 2, "9:00pm", 1, "12:00am", 1, 15);
		
		list = new LinkedList<Route>();
		list.add(r1);
		list.add(r2);
		list.add(r3);
		list.add(r4);
		list.add(r5);
		list.add(r6);
		list.add(r7);
		list.add(r8);
		list.add(r9);
		
		hmap = new HashMap<String, List<Route>>();
		LinkedList<Route> ru = new LinkedList<Route>();
		ru.add(r1);
		ru.add(r2);
		ru.add(r3);
		ru.add(r4);
		hmap.put("Albany,NY-New York,NY", ru);
		
		LinkedList<Route> ru2 = new LinkedList<Route>();
		ru2.add(r5);
		ru2.add(r6);
		ru2.add(r7);
		ru2.add(r8);
		ru2.add(r9);
		hmap.put("New York,NY-Albany,NY", ru2);
		
		hmap2 = new HashMap<String, List<Route>>();
		LinkedList<Route> rs1 = new LinkedList<Route>();
		rs1.add(r1);
		hmap2.put("1", rs1);
		
		LinkedList<Route> rs2 = new LinkedList<Route>();
		rs2.add(r2);
		hmap2.put("2", rs2);
		
		LinkedList<Route> rs3 = new LinkedList<Route>();
		rs3.add(r3);
		hmap2.put("3", rs3);
	}

	@GET
	@Path("/xml")
	@Produces (MediaType.APPLICATION_XML)
	public List<Route> getRoutesXML() {
		return list;
	}	
	
	@GET
	@Path("/json")
	@Produces(MediaType.APPLICATION_JSON)	
	public List<Route> getRoutesJson() {
		return list;
	}

	@GET
	@Path("/id/xml/{name}")
	@Produces (MediaType.APPLICATION_XML)
	public List<Route> getRouteByIDXML(@PathParam("name") String name) {
		if(hmap2.containsKey(name)) {
			System.out.println("name: " + name);
			
			return hmap2.get(name);
		}
		else return null;
	}	
	
	@GET
	@Path("/id/json/{name}")
	@Produces(MediaType.APPLICATION_JSON)	
	public List<Route> getRouteByIDJson(@PathParam("name") String name) {
		if(hmap2.containsKey(name)) {
			System.out.println("name: " + name);
			
			return hmap2.get(name);
		}
		else return null;
	}
	
	@GET
	@Path("/city/xml/{name}")
	@Produces (MediaType.APPLICATION_XML)
	public List<Route> getRoutesByCityXML(@PathParam("name") String name) {
		if(hmap.containsKey(name)) {
			System.out.println("name: " + name);
			
			return hmap.get(name);
		}
		else return null;
	}	
	
	@GET
	@Path("/city/json/{name}")
	@Produces(MediaType.APPLICATION_JSON)	
	public List<Route> getRoutesByCityJson(@PathParam("name") String name) {
		if(hmap.containsKey(name)) {
			System.out.println("name: " + name);
			
			return hmap.get(name);
		}
		else return null;
	}	
}
