package com.guide.cm.clientnamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ClientNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientNamingServerApplication.class, args);
	}

}
