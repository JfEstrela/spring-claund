package com.jf.estrela.microserviceclass.cloud.discipline.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class DisciplineServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisciplineServerApplication.class, args);
	}
}
