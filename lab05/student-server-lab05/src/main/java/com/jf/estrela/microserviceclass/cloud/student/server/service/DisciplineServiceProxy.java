package com.jf.estrela.microserviceclass.cloud.student.server.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jf.estrela.microserviceclass.cloud.student.server.feign.DisciplineClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@Service
public class DisciplineServiceProxy {

	@Autowired
	DisciplineClient disciplineClient;

	@HystrixCommand(fallbackMethod = "getNomesDisciplinesFallback", commandProperties = {
			@HystrixProperty(name = "execution.isolation.strategy", value = "THREAD"),
			@HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "5"),
			@HystrixProperty(name = "requestCache.enabled", value = "false"), }, threadPoolProperties = {
					@HystrixProperty(name = "coreSize", value = "5"),
					@HystrixProperty(name = "maximumSize", value = "5") })
	public List<String> getNomesDisciplines() {
		return disciplineClient.getAllNamesDisciplinas().getBody();
	}

	public List<String> getNomesDisciplinesFallback() {
		return Arrays.asList("java web","java poo");
	}

}
