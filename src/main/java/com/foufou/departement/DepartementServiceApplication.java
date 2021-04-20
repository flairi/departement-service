package com.foufou.departement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DepartementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartementServiceApplication.class, args);
		/*SpringApplication springApp = new SpringApplication(DepartementServiceApplication.class);
		springApp.setApplicationStartup(new FlightRecorderApplicationStartup());
		springApp.run(args);*/
	}

}
