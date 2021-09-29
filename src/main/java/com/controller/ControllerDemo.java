package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.service.ServiceDemo;

@RestController
public class ControllerDemo {
	
	@Autowired
	private ServiceDemo messageService;
	
	@GetMapping("/hello")
	public String sayHello(@RequestParam String user)
	{
		return messageService.getSubscriptionMessage(user);
	}

}
