package com.service;

import org.springframework.stereotype.Component;

@Component
public class ServiceDemo {
	
	public String getSubscriptionMessage(String user)
	{
		return "Hello " + user + ", Thanks for the Subscription.";
	}
}
