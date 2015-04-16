package com.takebus.service;

import java.util.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/schedule")
public class ScheduleService {
	List<Schedule> list;
	HashMap<String, List<Schedule>> hmap;
	HashMap<String, List<Schedule>> hmap2;
	
	public ScheduleService() {
		Schedule s1 = new Schedule(1, "CBT423", 1, "7:20am", 2, "11:30am", 1, 15);
		Schedule s2 = new Schedule(2, "CBT523", 1, "12:50am", 2, "5:00pm", 1, 15);
		Schedule s3 = new Schedule(3, "CBT623", 1, "5:50pm", 2, "10:00pm", 1, 15);
		Schedule s4 = new Schedule(4, "CBT723", 1, "10:30pm", 2, "2:00am", 1, 15);
		
		list = new LinkedList<Schedule>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		hmap = new HashMap<String, List<Schedule>>();
		hmap.put("Albany, NY-New York, NY", list);
		
		hmap2 = new HashMap<String, List<Schedule>>();
		List<Schedule> ss1 = new LinkedList<Schedule>();
		ss1.add(s1);
		hmap2.put("CBT423", ss1);
		
		List<Schedule> ss2 = new LinkedList<Schedule>();
		ss2.add(s2);
		hmap2.put("CBT523", ss1);
		
		List<Schedule> ss3 = new LinkedList<Schedule>();
		ss3.add(s3);
		hmap2.put("CBT623", ss3);
		
		List<Schedule> ss4 = new LinkedList<Schedule>();
		ss4.add(s4);
		hmap2.put("CBT723", ss4);
	}

	@GET
	@Path("/xml")
	@Produces (MediaType.APPLICATION_XML)
	public List<Schedule> getRoutesXML() {
		return list;
	}	
	
	@GET
	@Path("/json")
	@Produces(MediaType.APPLICATION_JSON)	
	public List<Schedule> getRoutesJson() {
		return list;
	}
	
	@GET
	@Path("/id/xml/{name}")
	@Produces (MediaType.APPLICATION_XML)
	public List<Schedule> getScheduleByIDXML(@PathParam("name") String name) {
		if(hmap2.containsKey(name)) {
			
			return hmap2.get(name);
		}
		else return null;
	}	
	
	@GET
	@Path("/id/json/{name}")
	@Produces(MediaType.APPLICATION_JSON)	
	public List<Schedule> getScheduleByIDJson(@PathParam("name") String name) {
		if(hmap2.containsKey(name)) {
			
			return hmap2.get(name);
		}
		else return null;
	}	
	
	@GET
	@Path("/city/xml/{name}")
	@Produces (MediaType.APPLICATION_XML)
	public List<Schedule> getScheduleByCityXML(@PathParam("name") String name) {
		if(hmap.containsKey(name)) {
			
			return hmap.get(name);
		}
		else return null;
	}	
	
	@GET
	@Path("/city/json/{name}")
	@Produces(MediaType.APPLICATION_JSON)	
	public List<Schedule> getScheduleByCityJson(@PathParam("name") String name) {
		if(hmap.containsKey(name)) {
			
			return hmap.get(name);
		}
		else return null;
	}
}
