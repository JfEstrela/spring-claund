package com.jf.estrela.microserviceclass.cloud.discipline.server.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.Resources;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jf.estrela.microserviceclass.cloud.discipline.server.dto.StudentDTO;

@FeignClient("student-server")
public interface StudentsClients {
	
	  @RequestMapping(value = "/students", method = RequestMethod.GET)
	  ResponseEntity<List<StudentDTO>> getAllAlunos();

      @RequestMapping(value = "/students/{id}/dto", method = RequestMethod.GET)
      StudentDTO getAluno(@PathVariable("id") Long id);

}
