package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyTestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyTestAppApplication.class, args);
		System.out.println("Hello");
	}

}
