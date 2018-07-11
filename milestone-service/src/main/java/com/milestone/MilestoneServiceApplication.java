package com.milestone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MilestoneServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MilestoneServiceApplication.class, args);
	}
}
