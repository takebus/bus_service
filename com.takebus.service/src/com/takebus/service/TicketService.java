package com.takebus.service;

import java.util.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ticket")
public class TicketService {
	private List<Ticket> list;
	private HashMap<String, List<Ticket>> hmap;
	
	
	public TicketService() {
		Ticket t1 = new Ticket(1, 1, "Dean Brian", "2015-04-25", "", "", 15);
		Ticket t2 = new Ticket(2, 5, "Dean Brian", "2015-04-26", "", "", 15);
		
		Ticket t3 = new Ticket(3, 3, "Richard Claderman", "2015-05-01", "", "", 15); 
		Ticket t4 = new Ticket(4, 7, "Claderman Claderman", "2015-05-02", "", "", 15); 
		
		list = new LinkedList<Ticket>();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		
		hmap = new HashMap<String ,List<Ticket>>();
		List<Ticket> l1 = new LinkedList<Ticket>();
		l1.add(t1);
		
		List<Ticket> l2 = new LinkedList<Ticket>();
		l2.add(t2);
		
		List<Ticket> l3 = new LinkedList<Ticket>();
		l3.add(t3);
		
		List<Ticket> l4 = new LinkedList<Ticket>();
		l4.add(t4);
		
		hmap.put("1", l1);
		hmap.put("2", l2);
		hmap.put("3", l3);
		hmap.put("4", l4);
	}
	
	@GET
	@Path("/xml")
	@Produces (MediaType.APPLICATION_XML)
	public List<Ticket> getTicketsXML() {
		return list;
	}

	@GET
	@Path("/json")
	@Produces (MediaType.APPLICATION_JSON)
	public List<Ticket> getTicketsJson() {
		return list;
	}
	
	@GET
	@Path("/id/xml/{name}")
	@Produces (MediaType.APPLICATION_XML)
	public List<Ticket> getTicketByIDXML(@PathParam("name") String name) {
		if(hmap.containsKey(name)) {
			return hmap.get(name);
		}
		else return null;
	}	
	
	@GET
	@Path("/id/json/{name}")
	@Produces(MediaType.APPLICATION_JSON)	
	public List<Ticket> getTicketByIDJson(@PathParam("name") String name) {
		if(hmap.containsKey(name)) {
			return hmap.get(name);
		}
		else return null;
	}
		
}
