package com.tcs.microservice.UserServiceSystemAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserServiceSystemApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceSystemApiApplication.class, args);
		
		System.out.println("system API Satrted");
	}

}
