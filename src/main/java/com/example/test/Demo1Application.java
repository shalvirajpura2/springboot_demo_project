package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		System.out.println("Spring boot hello world app running");
		String myArg = "Welcome to my App";
		SpringApplication.run(Demo1Application.class, myArg);
	}

}
/*
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootHelloWorldExample {
	public static void main(String[] args) {
		System.out.println("Spring boot hello world app running");
		SpringApplication.run(SpringBootHelloWorldExample.class, args);
	}
}*/