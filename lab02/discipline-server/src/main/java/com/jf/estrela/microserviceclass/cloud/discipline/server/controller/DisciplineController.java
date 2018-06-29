package com.jf.estrela.microserviceclass.cloud.discipline.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jf.estrela.microserviceclass.cloud.discipline.server.entity.Discipline;
import com.jf.estrela.microserviceclass.cloud.discipline.server.service.DisciplineService;

@RestController
@RequestMapping(path = "/disciplines")
public class DisciplineController {
	
	@Autowired
	private DisciplineService disciplinaService;
	
	@GetMapping(value="/students/{disciplineId}")
	public ResponseEntity<Discipline> getStudentDiscipline(@PathVariable Long disciplineId){
		return ResponseEntity.ok().body(disciplinaService.findStudentDispline(disciplineId));
	}

}
