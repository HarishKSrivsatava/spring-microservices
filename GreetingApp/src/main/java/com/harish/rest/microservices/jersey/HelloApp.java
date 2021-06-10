package com.harish.rest.microservices.jersey;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class HelloApp extends SpringBootServletInitializer  {
	public static void main(String[] args) {
		 new HelloApp().configure(new SpringApplicationBuilder(HelloApp.class)).run(args);
	}

}
