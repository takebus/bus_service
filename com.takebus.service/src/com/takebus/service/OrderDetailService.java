package com.takebus.service;

import java.util.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/orderDetail")
public class OrderDetailService {

	private List<OrderDetail> list;
	private HashMap<String, List<OrderDetail>> hmap;
	
	public OrderDetailService() {
		OrderDetail o1 = new OrderDetail(1, 1, 1, 15, 3, 45, "Y", "CYA");
		OrderDetail o2 = new OrderDetail(2, 1, 2, 15, 3, 45, "Y", "DFU");
		OrderDetail o3 = new OrderDetail(3, 2, 1, 15, 1, 15, "Y", "MZE");
		OrderDetail o4 = new OrderDetail(4, 2, 2, 15, 1, 15, "Y", "LQG");
		
		list = new LinkedList<OrderDetail>();
		list.add(o1);
		list.add(o2);
		list.add(o3);
		list.add(o4);
		
		
		List<OrderDetail> os1 = new LinkedList<OrderDetail>();
		os1.add(o1);
		List<OrderDetail> os2 = new LinkedList<OrderDetail>();
		os2.add(o2);
		List<OrderDetail> os3 = new LinkedList<OrderDetail>();
		os3.add(o3);
		List<OrderDetail> os4 = new LinkedList<OrderDetail>();
		os4.add(o4);
		
		hmap = new HashMap<String, List<OrderDetail>>();
		hmap.put("1", os1);
		hmap.put("2", os2);
		hmap.put("3", os3);
		hmap.put("4", os4);
	}

	@GET
	@Path("/xml")
	@Produces (MediaType.APPLICATION_XML)
	public List<OrderDetail> getOrderDetailsXML() {
		return list;
	}

	@GET
	@Path("/json")
	@Produces (MediaType.APPLICATION_JSON)
	public List<OrderDetail> getOrderDetailsJson() {
		return list;
	}

	@GET
	@Path("/id/xml/{name}")
	@Produces (MediaType.APPLICATION_XML)
	public List<OrderDetail> getOrderDetailByIDXML(@PathParam("name") String name) {
		if(hmap.containsKey(name)) {
			return hmap.get(name);
		}
		else return null;
	}	
	
	@GET
	@Path("/id/json/{name}")
	@Produces(MediaType.APPLICATION_JSON)	
	public List<OrderDetail> getOrderDetailByIDJson(@PathParam("name") String name) {
		if(hmap.containsKey(name)) {
			return hmap.get(name);
		}
		else return null;
	}
		
}
