package com.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.model.User;
import com.java.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService service;
	
	
	@PostMapping("/adduser")
	public User save(@RequestBody User user)
	{
		return service.saveUser(user);
	}
	
	@GetMapping("/getusers")
	public List<User> getAllUsers()
	{
		return service.getAllUsers();
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public void deleteUser(@PathVariable int id)
	{
		service.deleteUSerById(id);
	}
	
	
	
	
	
	
	
	

}
