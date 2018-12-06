package com.jk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RefreshScope
@RestController
@MapperScan("com.jk.Mapper")
@EnableDiscoveryClient
public class OrderEurekaProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderEurekaProducerApplication.class, args);
	}
}
