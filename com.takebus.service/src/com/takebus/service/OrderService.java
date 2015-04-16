package com.takebus.service;

import java.util.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/order")
public class OrderService {
	
	private List<Order> list;
	private HashMap<String, List<Order>> hmap;
	
	public OrderService() {
	
		Order o1 = new Order(1, 1, "2015-04-14");
		Order o2 = new Order(2, 2, "2015-04-14");
				
		list = new LinkedList<Order>();
		list.add(o1);
		list.add(o2);
		
		hmap = new HashMap<String, List<Order>>();
		List<Order> os1 = new LinkedList<Order>();
		os1.add(o1);
		hmap.put("1", os1);
		
		List<Order> os2 = new LinkedList<Order>();
		os2.add(o2);
		hmap.put("2", os2);
	}

	@GET
	@Path("/xml")
	@Produces (MediaType.APPLICATION_XML)
	public List<Order> getOrdersXML() {
		if (list.size() > 0) {
			return list;
		}
		else return null;
	}	
	
	@GET
	@Path("/json")
	@Produces(MediaType.APPLICATION_JSON)	
	public List<Order> getOrdersJson() {
		if (list.size() > 0) {
			return list;
		}
		else return null;
	}		

	@GET
	@Path("/id/xml/{name}")
	@Produces(MediaType.APPLICATION_XML)	
	public List<Order> getOrdersByEmailXML(@PathParam("name") String name) {
		if(hmap.containsKey(name)) {
			System.out.println("name: " + name);
			
			return hmap.get(name);
		}
		else return null;
	}	
	
	@GET
	@Path("/id/json/{name}")
	@Produces(MediaType.APPLICATION_JSON)	
	public List<Order> getOrdersByEmailJson(@PathParam("name") String name) {
		if(hmap.containsKey(name)) {
			System.out.println("name: " + name);
			
			return hmap.get(name);
		}
		else return null;
	}

}
