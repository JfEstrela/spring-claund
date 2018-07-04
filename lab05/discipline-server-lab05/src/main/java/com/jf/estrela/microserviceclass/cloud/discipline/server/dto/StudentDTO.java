package com.jf.estrela.microserviceclass.cloud.discipline.server.dto;

import java.io.Serializable;

public class StudentDTO implements Serializable{
	
	private Long id;
	private String name;
	private Integer registration;
	private String email;
	
	public StudentDTO() {}
	
	
	public StudentDTO(String name, Integer registration, String email) {
		super();
		this.name = name;
		this.registration = registration;
		this.email = email;
	}
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
	
	

}
