package com.tekb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationBApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationBApplication.class, args);
	}

}
