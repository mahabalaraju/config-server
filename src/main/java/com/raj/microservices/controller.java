package com.raj.microservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {


	@Value("${raj.name}")
	private String maha;
	
	
	@GetMapping("/hello")
	public String da() {
		return maha;
	}
	
}
