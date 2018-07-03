package com.jf.estrela.microserviceclass.cloud.discipline.server.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jf.estrela.microserviceclass.cloud.discipline.server.entity.Discipline;
import com.jf.estrela.microserviceclass.cloud.discipline.server.feign.StudentsClients;
import com.jf.estrela.microserviceclass.cloud.discipline.server.repository.DisciplineRepository;


@Service
public class DisciplineService {
	
	@Autowired
	private DisciplineRepository repository;
	
	@Autowired
	StudentsClients studentsClients;
	
	
	
	@SuppressWarnings("unchecked")
	public Discipline findStudentDispline(Long idDiscipline){	
        Discipline discipline = new Discipline();
        discipline.setCargaHoraria(1);
        discipline.setDataInicio(new Date());
        discipline.setId(1L);
        discipline.setNome("Programação");
        discipline.setStudentsRegitrations(studentsClients.getAllAlunos().getBody());
		return discipline;
		
	}
	
	public List<String> getNamesDiscipline(){
		List<Discipline> disciplines = repository.findAll();
		List<String> names = new ArrayList<>();
		disciplines.stream().forEach(discipline -> names.add(discipline.getNome()));
		return names;
	}
	
	public List<Discipline> getDisciplines(){
		return repository.findAll();
	}

}
