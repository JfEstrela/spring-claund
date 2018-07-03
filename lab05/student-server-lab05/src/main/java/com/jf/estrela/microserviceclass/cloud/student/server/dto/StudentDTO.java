package com.jf.estrela.microserviceclass.cloud.student.server.dto;

import java.io.Serializable;
import java.util.List;

public class StudentDTO implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Integer registration;
	private String email;
	private List<DisciplineDTO> disciplines;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRegistration() {
		return registration;
	}
	public void setRegistration(Integer registration) {
		this.registration = registration;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<DisciplineDTO> getDisciplines() {
		return disciplines;
	}
	public void setDisciplines(List<DisciplineDTO> disciplines) {
		this.disciplines = disciplines;
	}
	
	

}
