package com.takebus.service;

import java.util.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/operator")
public class BusOperatorService {

	HashMap<String, List<BusOperator>> hmap;
	private List<BusOperator> list;
	
	public BusOperatorService() {
		BusOperator b1 = new BusOperator(1, "Capital Bus Tours");
		BusOperator b2 = new BusOperator(2, "HG Bus");
		
		list = new LinkedList<BusOperator>();
		list.add(b1);
		list.add(b2);
		
		hmap = new HashMap<String, List<BusOperator>>();
		List<BusOperator> bs1 = new LinkedList<BusOperator>();
		bs1.add(b1);
		List<BusOperator> bs2 = new LinkedList<BusOperator>();
		bs2.add(b2);
		
		hmap.put("1", bs1);
		hmap.put("2", bs2);
	}

	@GET
	@Path("/xml")
	@Produces (MediaType.APPLICATION_XML)
	public List<BusOperator> getBusOperatorsXML() {
		return list;
	}

	@GET
	@Path("/json")
	@Produces (MediaType.APPLICATION_JSON)
	public List<BusOperator> getBusOperatorsJson() {
		return list;
	}
	
	@GET
	@Path("/id/xml/{name}")
	@Produces (MediaType.APPLICATION_XML)
	public List<BusOperator> getBusOperatorByIDXML(@PathParam("name") String name) {
		if(hmap.containsKey(name)) {
			return hmap.get(name);
		}
		else return null;
	}	
	
	@GET
	@Path("/id/json/{name}")
	@Produces(MediaType.APPLICATION_JSON)	
	public List<BusOperator> getBusOperatorByIDJson(@PathParam("name") String name) {
		if(hmap.containsKey(name)) {
			return hmap.get(name);
		}
		else return null;
	}	

}
