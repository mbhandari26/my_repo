package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Commit1");
		System.out.println("commit2");
		System.out.println("commit3");
		System.out.println("revert this");
		SpringApplication.run(DemoApplication.class, args);

	}

}