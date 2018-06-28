package com.jf.estrela.microserviceclass.cloud.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/config")
@RefreshScope
public class ClientController {
	
	@Autowired
	private Environment env;
	
	@GetMapping(value="{key}")
	public ResponseEntity<String> getprops(@PathVariable String key){
		return ResponseEntity.ok().body(env.getProperty(key));
	}

}
