package com.raj.microservices.propertysource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
@Autowired
private Dbsettings dbsettings;

@Autowired
PropertysourceDemo demo1;


@GetMapping("/dbsettings")
public String gea() {
	System.out.println(demo1.getEmail());
	return dbsettings.getConnection()+dbsettings.getHost()+dbsettings.getPort();
}
}
