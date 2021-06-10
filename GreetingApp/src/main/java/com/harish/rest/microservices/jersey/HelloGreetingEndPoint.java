package com.harish.rest.microservices.jersey;

import org.springframework.stereotype.Component;

import javax.ws.rs.Path;
import javax.ws.rs.GET;

@Component
@Path("/hello")
public class HelloGreetingEndPoint {
	
	@GET
	public String message() {
		return "Hello World!";
	}

}
