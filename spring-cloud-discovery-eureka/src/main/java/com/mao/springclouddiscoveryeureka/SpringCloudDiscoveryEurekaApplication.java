package com.mao.springclouddiscoveryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudDiscoveryEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDiscoveryEurekaApplication.class, args);
	}
}
