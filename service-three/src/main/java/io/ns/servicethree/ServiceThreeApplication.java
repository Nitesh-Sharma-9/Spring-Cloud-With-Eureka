package io.ns.servicethree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceThreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceThreeApplication.class, args);
	}

}

