package com.example.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.controller.EmployeeController;
import com.example.model.Employee;
import com.example.repository.EmployeeRepository;



@SpringBootApplication
@EnableAutoConfiguration
//@ComponentScan({"com.example.controller", "com.example.service", "com.example.repository"})
//@EnableAutoConfiguration



@EnableJpaRepositories("com.example.*")
@ComponentScan(basePackages = { "com.example.*" })
@EntityScan("com.example.*") 
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
