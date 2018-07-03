package com.jf.estrela.microserviceclass.cloud.student.server.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jf.estrela.microserviceclass.cloud.student.server.dto.DisciplineDTO;

@FeignClient("discipline-server")
public interface DisciplineClient {
	
	  @RequestMapping(value = "/disciplines", method = RequestMethod.GET)
	  ResponseEntity<List<DisciplineDTO>> getAllDisciplinas();

      @RequestMapping(value = "/disciplines/{id}/dto", method = RequestMethod.GET)
      DisciplineDTO getDisciplina(@PathVariable("id") Long id);
      
      @RequestMapping(value = "/disciplines/names", method = RequestMethod.GET)
	  ResponseEntity<List<String>> getAllNamesDisciplinas();

}
