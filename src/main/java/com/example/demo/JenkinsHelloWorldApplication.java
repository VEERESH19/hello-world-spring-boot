package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class JenkinsHelloWorldApplication {
	
	   @RequestMapping("/")
	    String home() {
	        return "Hello World - jenkins!";
	    }

	public static void main(String[] args) {
		SpringApplication.run(JenkinsHelloWorldApplication.class, args);
	}

}
