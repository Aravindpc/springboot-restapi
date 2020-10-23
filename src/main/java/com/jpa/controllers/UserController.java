package com.jpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@GetMapping(value="/getuser")
	public String check()
	{
		System.out.println("Hi");
		return "abc";
	}
	
	@GetMapping(value="/getusername")
	public List<String> getAllUserNames()
	{
		return userRepository.getAllUserNames();
	}
	
}
