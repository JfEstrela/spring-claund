package com.jf.estrela.microserviceclass.cloud.student.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jf.estrela.microserviceclass.cloud.student.server.repository.StudentRepository;

import com.jf.estrela.microserviceclass.cloud.student.server.entity.Student;

@RestController
@RequestMapping(path = "/students")
public class StudentController {
	
	@Autowired
	private StudentRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Student>> getStudentsByDiscipline(){
		return ResponseEntity.ok().body(repository.findAll());
	}

}
