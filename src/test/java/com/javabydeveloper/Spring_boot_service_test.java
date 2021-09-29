package com.javabydeveloper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.service.ServiceDemo;

@SpringBootTest
class Spring_boot_service_test {

	@Autowired
	private ServiceDemo messageService;
	
	@Test
	@DisplayName("Subscription message service Test")
	void testSubscriptionMessage()
	{
		String user = "Peter";
		
		String message = messageService.getSubscriptionMessage(user);
		assertEquals("Hello " + user + ", Thanks for the Subscription.", message);
	}
	
}
