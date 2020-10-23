package com.jpa.jpamysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.jpa.controllers")
@ComponentScan("com.jpa.repository")
public class JpaMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaMysqlApplication.class, args);
	}

}
