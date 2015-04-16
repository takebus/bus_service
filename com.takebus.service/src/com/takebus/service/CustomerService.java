package com.takebus.service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/customer")
public class CustomerService {

	private HashMap<String, List<Customer>> hmap;
	private List<Customer> cus;
	
	public CustomerService() {
		Customer c1 = new Customer(1, "dean@gmail.com", "123456", "Dean", "Brian", "4051237890", "123 Ame Ave", "Milpita", "CA", "95123", "US", "2015-04-12", "2015-04-12");
		Customer c2 = new Customer(2, "richard@gmail.com", "123456", "Richard", "Claderman", "5041237890", "N 1st St", "SF", "CA", "95012", "US", "2015-04-12", "2015-04-12");
		Customer c3 = new Customer(3, "allian@gmail.com", "123456", "Allian", "Abthtoms", "4051237890", "E 12th St", "San Jose", "CA", "95112", "US", "2015-04-12", "2015-04-12");
	
		cus = new LinkedList<Customer>();
		cus.add(c1);
		cus.add(c2);
		cus.add(c3);
		
		hmap = new HashMap<String, List<Customer>>();
		List<Customer> l1 = new LinkedList<Customer>();
		l1.add(c1);
		List<Customer> l2 = new LinkedList<Customer>();
		l2.add(c2);
		List<Customer> l3 = new LinkedList<Customer>();
		l3.add(c3);
		hmap.put("bdean@mail.com", l1);
		hmap.put("richard@gmail.com", l2);
		hmap.put("allian@gmail.com", l3);
	}

	@GET
	@Path("/xml")
	@Produces (MediaType.APPLICATION_XML)
	public List<Customer> getCustomersXML() {
		if (cus.size() > 0) {
			return cus;
		}
		else return null;
	}	
	
	@GET
	@Path("/json")
	@Produces(MediaType.APPLICATION_JSON)	
	public List<Customer> getCustomersJson() {
		if (cus.size() > 0) {
			return cus;
		}
		else return null;
	}	

	@GET
	@Path("/xml/{name}")
	@Produces (MediaType.APPLICATION_XML)
	public List<Customer> getCustomerByNameXML(@PathParam("name") String name) {
		if(hmap.containsKey(name)) {
			
			return hmap.get(name);
		}
		else return null;
	}	
	
	@GET
	@Path("/json/{name}")
	@Produces(MediaType.APPLICATION_JSON)	
	public List<Customer> getCustomerByNameJson(@PathParam("name") String name) {
		if(hmap.containsKey(name)) {
			
			return hmap.get(name);
		}
		else return null;
	}
	
}
