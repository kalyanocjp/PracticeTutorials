package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RefreshScope
@RestController
public class Service1Controller {
	
	Logger log = LoggerFactory.getLogger(Service1Controller.class);
	
	@Value("${message: default Hello}")
	private String message;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/service1")
	public String getService1Response() {
		log.info("Inside SpringOne Service............"+message);
		log.info("Inside Service1....");
		String response = restTemplate.getForObject("http://localhost:8082/service2", String.class);
		
		return response+"  Hello service1 here";
	}

}
