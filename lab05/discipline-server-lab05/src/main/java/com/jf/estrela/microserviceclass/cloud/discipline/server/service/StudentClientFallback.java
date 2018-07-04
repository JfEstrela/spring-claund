package com.jf.estrela.microserviceclass.cloud.discipline.server.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.jf.estrela.microserviceclass.cloud.discipline.server.dto.StudentDTO;
import com.jf.estrela.microserviceclass.cloud.discipline.server.feign.StudentsClients;

@Component
public class StudentClientFallback implements StudentsClients{
	
	private static List<StudentDTO> studentsFallback;
	
	static {
		studentsFallback = Arrays.asList(new StudentDTO("aluno 1", 1, "teste@teste"),new StudentDTO("aluno 2", 2, "teste@teste"));
	}

	@Override
	public ResponseEntity<List<StudentDTO>> getAllAlunos() {
		return new ResponseEntity<List<StudentDTO>>(studentsFallback, HttpStatus.OK);
	}

	@Override
	public StudentDTO getAluno(Long id) {
		return new StudentDTO("aluno 1",1,"teste@teste");
	}

}
