package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service2Controller {
	
	Logger log = LoggerFactory.getLogger(Service2Controller.class);
	
	@RequestMapping("/service2")
	public String getService2Response() {
		log.info("Inside 2nd response....");
		return "Hello service2 here";
	}

}
