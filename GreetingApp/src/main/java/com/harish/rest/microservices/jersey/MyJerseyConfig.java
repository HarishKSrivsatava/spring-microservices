package com.harish.rest.microservices.jersey;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
@ApplicationPath(value="/resources")
public class MyJerseyConfig  extends ResourceConfig {

	public MyJerseyConfig() {
		 register(HelloGreetingEndPoint.class);
	}
}
