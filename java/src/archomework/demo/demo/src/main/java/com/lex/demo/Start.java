package com.lex.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class Start {

	public static void main(String[] args) {
		System.out.println("Start...");
		SpringApplication.run(Start.class, args);
		System.out.println("end...");

	}
	
	@RequestMapping("/say")
	@ResponseBody
	public String sayHello() {
		System.out.println("hello");
		return "Hello, SpringBoot!";
	}

}
