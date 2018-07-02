package com.jf.estrela.microserviceclass.cloud.student.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jf.estrela.microserviceclass.cloud.student.server.dto.StudentDTO;
import com.jf.estrela.microserviceclass.cloud.student.server.feign.DisciplineClient;

@Service
public class StudentService {
	
	@Autowired
	DisciplineClient disciplineClient;
	 
	 
	 @SuppressWarnings("unchecked")
	public StudentDTO getStudentesAndDisciplines() {
		 StudentDTO dto = new StudentDTO();
		 dto.setName("Teste");
		 dto.setId(1L);
		 dto.setRegistration(1);
		 dto.setEmail("teste@teste");
		 dto.setDisciplines(disciplineClient.getAllDisciplinas().getBody());
		 return dto;
	 }

}
