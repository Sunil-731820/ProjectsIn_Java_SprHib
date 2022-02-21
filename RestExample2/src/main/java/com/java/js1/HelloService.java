package com.java.js1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/hello")
public class HelloService {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello() {
		return "Hello I am Sunil";
	}
	
	@GET
	@Path("/omkar")
	@Produces(MediaType.TEXT_PLAIN)
	public String omkar() {
		return "Hello He is Omkar";
	}
	
	@GET
	@Path("/utsav")
	@Produces(MediaType.TEXT_PLAIN)
	public String utsav() {
		return "Utsav is My best Friend";
	}

}
