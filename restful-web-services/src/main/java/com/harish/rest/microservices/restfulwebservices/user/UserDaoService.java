package com.harish.rest.microservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	 private static List<User> listOfUsers = new ArrayList<>();
	 
	 static {
		 listOfUsers.add(new User(1,"Jack",  new Date()));
		 listOfUsers.add(new User(2,"Jill",  new Date()));
		 listOfUsers.add(new User(3,"Jimmy", new Date()));
	 }
	 
	 public List<User> findAll(){
		 return listOfUsers;
		 
	 }
	 
}
