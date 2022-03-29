package com.kuldeep.microservices.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * All you need to run a Eureka registration server.
 *  
 * @author Kuldeep S Chauhan
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class RegistrationServerEurekaApplication {

	/**
     * Run the application using Spring Boot and an embedded servlet engine.
     * 
     * @param args Program arguments - ignored.
     */	
	public static void main(String[] args) {

		SpringApplication.run(RegistrationServerEurekaApplication.class, args);
	}

}
