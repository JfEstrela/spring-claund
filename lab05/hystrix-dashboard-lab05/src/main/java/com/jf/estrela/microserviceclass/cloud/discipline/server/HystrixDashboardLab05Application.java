package com.jf.estrela.microserviceclass.cloud.discipline.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class HystrixDashboardLab05Application {

	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboardLab05Application.class, args);
	}
}
