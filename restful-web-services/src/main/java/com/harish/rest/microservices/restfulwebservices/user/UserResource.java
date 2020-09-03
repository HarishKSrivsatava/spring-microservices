package com.harish.rest.microservices.restfulwebservices.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserResource {

	    @Autowired
	    private UserDaoService userDaoService;
	    
		@RequestMapping(method = RequestMethod.GET, path="/findAllUsers")
	    public List<User> findAllUsers() {
			return userDaoService.findAll();
		}
}
