package com.damienwesterman.defensedrill.server_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DefenseDrillServerRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DefenseDrillServerRegistryApplication.class, args);
	}

}
