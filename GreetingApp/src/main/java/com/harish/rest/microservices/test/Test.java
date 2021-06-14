package com.harish.rest.microservices.test;

import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;


@Configuration
public class Test {

	@Value("{$name}")
	private String name;
}
