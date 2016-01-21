package org.demo.hellojaxrs.api;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Stateless
@Path("/hello")
public class HelloResource {
	public static final String APPLICATION_JSON_UTF8 = MediaType.APPLICATION_JSON + ";charset=UTF-8"; 
	
	/*
	 * http://localhost:8080/hellojaxrs/api/hello
	 */
	
	@GET
	@Produces(HelloResource.APPLICATION_JSON_UTF8)
	public HelloModel getHello() {
		HelloModel hello = new HelloModel();
		hello.setMessage("Hello");
		return hello;
	}
}
