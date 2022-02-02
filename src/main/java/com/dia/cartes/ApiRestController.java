package com.dia.cartes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dia.cartes.model.User;
import com.dia.cartes.service.UserService;

@RestController
public class ApiRestController  {

	@Autowired
	private UserService service;
	
	@RequestMapping(method=RequestMethod.GET, value = "/user")
	public List<User> getAllUser(){
		return service.getAllUser();
	}
	@RequestMapping(method=RequestMethod.GET, value ="/user/{id}")
	public User getUderById(@PathVariable("id") int id) {
		
		return service.getUderById(id);	
	}
	@RequestMapping(method=RequestMethod.POST, value="/user")
	public void addUser(@RequestBody User u) {
		service.addUser(u);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/user/{id}")
	public void deleteUser(@PathVariable int id) {
		service.deleteUser(id);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/user")
	public void updateUser(@RequestBody User u) {
		service.updateUser(u);
	}
	
	
}
