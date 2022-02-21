package com.java.rest;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("aliens")
public class AlienDAO {
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Alien> getAlien(){
		Alien a1 = new Alien();
		a1.setName("sunil");
		a1.setPoints(60);
		
		Alien a2 = new Alien();
		a2.setName("Harish");
		a2.setPoints(70);
		
		List<Alien> aliens = Arrays.asList(a1,a2);
		return aliens;
	}

}
