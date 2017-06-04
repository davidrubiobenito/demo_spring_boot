package com.drbotro.demo_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication
public class DemoSpringBootApplication extends  SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DemoSpringBootApplication.class);
	}
}

