package com.ambev.pratico2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ambev.pratico2")
public class Pratico2Application {

	public static void main(String[] args) {
		SpringApplication.run(Pratico2Application.class, args);
	}

}
