package com.jf.estrela.microserviceclass.cloud.discipline.server.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jf.estrela.microserviceclass.cloud.discipline.server.dto.StudentDTO;
import com.jf.estrela.microserviceclass.cloud.discipline.server.entity.Discipline;


@Service
public class DisciplineService {
	
	@Autowired
    private DiscoveryClient discoveryClient;
	
	public Discipline findStudentDispline(Long idDiscipline){
		RestTemplate restTemplate = new RestTemplate();
		List<ServiceInstance> instances = discoveryClient.getInstances("student-server");
		ServiceInstance serviceInstance = instances.get(0);
         String url = serviceInstance.getUri().toString().concat("/students");
         
			ResponseEntity<List<StudentDTO>> studentResponse = restTemplate.exchange(
					url, 
					HttpMethod.GET,
					null,
					new ParameterizedTypeReference<List<StudentDTO>>() {});
        Discipline discipline = new Discipline();
        discipline.setStudentsRegitrations(studentResponse.getBody());
		return discipline;
		
	}

}
