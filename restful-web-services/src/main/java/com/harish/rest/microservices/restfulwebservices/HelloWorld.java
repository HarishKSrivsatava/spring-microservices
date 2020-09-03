package com.harish.rest.microservices.restfulwebservices;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	//Return a String
	@RequestMapping(method= RequestMethod.GET,path = "/test")
	public String helloWorld() {
		return "Hello World!";
	}
	
	// Return a List
	@RequestMapping(method = RequestMethod.GET,path="/getMeaList")
	public Object test() {
		List<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		return arr;
		
		
	}
	
	//Give me a custom bean
	@RequestMapping(method = RequestMethod.GET, path="/giveMeaCustomBean")
    public MyBean getMeaCustomBean() {
		MyBean myBean = new MyBean();
		myBean.setId(1);
		myBean.setSocalSecurityNumber("SSN001");
		return myBean;
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/giveMeaCustomBean/{id}")
	public MyBean helloUserById(@PathVariable String id ) {
		MyBean myBean = new MyBean();
		myBean.setId(Integer.valueOf(id));
		myBean.setSocalSecurityNumber("SSN"+id);
		return myBean;

	}
}
