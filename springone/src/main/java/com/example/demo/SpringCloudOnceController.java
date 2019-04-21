package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SpringCloudOnceController {
	
	Logger log = LoggerFactory.getLogger(SpringCloudOnceController.class);
	
	private RestTemplate restTemplate;
	
	public SpringCloudOnceController(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	@RequestMapping("/springone")
	public String springOne() {
		log.info("Inside SpringOne Service...........");
		String responseValue =  restTemplate.getForObject("http://localhost:8081/service1", String.class);
		return "SPRINGONE "+responseValue;
	}

}
