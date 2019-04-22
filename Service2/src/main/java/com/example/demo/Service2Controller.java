package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service2Controller {
	
	Logger log = LoggerFactory.getLogger(Service2Controller.class);
	
	@Value("${message: default Hello}")
	private String message;
	
	@RequestMapping("/service2")
	public String getService2Response() {
		log.info("Inside 2nd response...."+message);
		return "Hello service2 here";
	}

}
