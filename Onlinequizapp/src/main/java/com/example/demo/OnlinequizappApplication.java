package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan (basePackages = "com.example.demo.bean")
@EnableJpaRepositories (basePackages = "com.example.demo.repository")
public class OnlinequizappApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlinequizappApplication.class, args);
		System.out.println("Server Up..........");
	}

}