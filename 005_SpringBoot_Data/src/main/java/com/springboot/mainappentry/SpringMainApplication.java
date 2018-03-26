package com.springboot.mainappentry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages= {"com.springboot.mysql.controller"})
public class SpringMainApplication {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SpringApplication.run(SpringMainApplication.class, args);

	}

}
