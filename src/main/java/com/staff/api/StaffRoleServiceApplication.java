package com.staff.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StaffRoleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StaffRoleServiceApplication.class, args);
	}

}
