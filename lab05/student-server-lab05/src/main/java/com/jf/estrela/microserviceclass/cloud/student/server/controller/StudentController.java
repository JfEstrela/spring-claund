package com.jf.estrela.microserviceclass.cloud.student.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jf.estrela.microserviceclass.cloud.student.server.repository.StudentRepository;
import com.jf.estrela.microserviceclass.cloud.student.server.service.DisciplineServiceProxy;
import com.jf.estrela.microserviceclass.cloud.student.server.service.StudentService;
import com.jf.estrela.microserviceclass.cloud.student.server.conf.RibbonConfiguration;
import com.jf.estrela.microserviceclass.cloud.student.server.dto.StudentDTO;
import com.jf.estrela.microserviceclass.cloud.student.server.entity.Student;

@RestController
@RequestMapping(path = "/students")
public class StudentController {
	
	@Autowired
	private StudentRepository repository;
	
	@Autowired
	private StudentService service;
	
	
	
	@GetMapping
	public ResponseEntity<List<Student>> getStudentsByDiscipline(){
		return ResponseEntity.ok().body(repository.findAll());
	}
	@GetMapping(path="/disciplines")
	public ResponseEntity<StudentDTO> getStudentesAndDisciplines(){
		return ResponseEntity.ok().body(service.getStudentesAndDisciplines());
	}

}
