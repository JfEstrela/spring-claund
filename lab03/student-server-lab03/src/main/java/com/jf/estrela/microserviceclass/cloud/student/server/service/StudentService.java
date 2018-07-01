package com.jf.estrela.microserviceclass.cloud.student.server.service;

import java.util.List;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jf.estrela.microserviceclass.cloud.student.server.conf.RibbonConfiguration;
import com.jf.estrela.microserviceclass.cloud.student.server.dto.DisciplineDTO;
import com.jf.estrela.microserviceclass.cloud.student.server.dto.StudentDTO;

@Service
@RibbonClient(name = "disciplina-service", configuration = RibbonConfiguration.class)
public class StudentService {
	
	 @LoadBalanced 
	 @Bean
	 RestTemplate restTemplate(){
	      return new RestTemplate();
	  }
	 
	 
	 @SuppressWarnings("unchecked")
	public StudentDTO getStudentesAndDisciplines() {
		 StudentDTO dto = new StudentDTO();
		 dto.setName("Teste");
		 dto.setId(1L);
		 dto.setRegistration(1);
		 dto.setEmail("teste@teste");
		 ResponseEntity<List> disciplines = restTemplate().getForEntity("http://discipline-server/disciplines/names",List.class);
		 dto.setDisciplines(disciplines.getBody());
		 return dto;
	 }

}
