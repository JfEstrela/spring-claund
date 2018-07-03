package com.jf.estrela.microserviceclass.cloud.student.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jf.estrela.microserviceclass.cloud.student.server.feign.DisciplineClient;

@Service
public class DisciplineServiceProxy {
	
	@Autowired
	DisciplineClient disciplineClient;

}
