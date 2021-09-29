package com.javabydeveloper;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URI;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class Spring_boot_api_test {

	@Autowired
	private TestRestTemplate restTemplate;
	
	@Test
	@DisplayName("/hello rest api test")
	void testMessage()
	{
		String user = "Peter";
		URI targetUrl = UriComponentsBuilder.fromUriString("/hello").queryParam("user", user).build().encode().toUri();
		System.out.println("URL  " + targetUrl ); //for testing in console
		String message = this.restTemplate.getForObject(targetUrl, String.class);
		System.out.println(message); //for testing in console
		assertEquals("Hello " + user + ", Thanks for the Subscription.", message);
	}
}
