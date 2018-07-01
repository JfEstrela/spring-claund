package com.jf.estrela.microserviceclass.cloud.discipline.server.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jf.estrela.microserviceclass.cloud.discipline.server.conf.RibbonConfiguration;
import com.jf.estrela.microserviceclass.cloud.discipline.server.dto.StudentDTO;
import com.jf.estrela.microserviceclass.cloud.discipline.server.entity.Discipline;
import com.jf.estrela.microserviceclass.cloud.discipline.server.repository.DisciplineRepository;


@Service
@RibbonClient(name = "student-service", configuration = RibbonConfiguration.class)
public class DisciplineService {
	
	@Autowired
	private DisciplineRepository repository;
	
	
	@LoadBalanced 
	@Bean
	RestTemplate restTemplate(){
	      return new RestTemplate();
	 }
	
	@SuppressWarnings("unchecked")
	public Discipline findStudentDispline(Long idDiscipline){
		ResponseEntity<List<StudentDTO>> students =  (ResponseEntity) restTemplate().getForEntity("http://student-server/students",
				List.class);
			
        Discipline discipline = new Discipline();
        discipline.setCargaHoraria(1);
        discipline.setDataInicio(new Date());
        discipline.setId(1L);
        discipline.setNome("Programação");
        discipline.setStudentsRegitrations((List<StudentDTO>) students.getBody());
		return discipline;
		
	}
	
	public List<String> getNamesDiscipline(){
		List<Discipline> disciplines = repository.findAll();
		List<String> names = new ArrayList<>();
		disciplines.stream().forEach(discipline -> names.add(discipline.getNome()));
		return names;
	}

}
