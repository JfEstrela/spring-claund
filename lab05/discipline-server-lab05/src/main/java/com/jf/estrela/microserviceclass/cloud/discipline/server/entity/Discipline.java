package com.jf.estrela.microserviceclass.cloud.discipline.server.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.jf.estrela.microserviceclass.cloud.discipline.server.dto.StudentDTO;

@Entity
public class Discipline {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private Integer cargaHoraria;
	private Date dataInicio;
	@Transient
	private List<StudentDTO> studentsRegitrations;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<StudentDTO> getStudentsRegitrations() {
		return studentsRegitrations;
	}
	public void setStudentsRegitrations(List<StudentDTO> studentsRegitrations) {
		this.studentsRegitrations = studentsRegitrations;
	}
	
	
	

}
