package com.jf.estrela.microserviceclass.cloud.student.server.dto;

import java.io.Serializable;
import java.util.Date;

public class DisciplineDTO implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome;
	private Integer cargaHoraria;
	private Date dataInicio;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	
	

}
