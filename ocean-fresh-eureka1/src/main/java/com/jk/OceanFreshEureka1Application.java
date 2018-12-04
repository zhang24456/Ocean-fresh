package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class OceanFreshEureka1Application {

	public static void main(String[] args) {
		SpringApplication.run(OceanFreshEureka1Application.class, args);
	}
}
