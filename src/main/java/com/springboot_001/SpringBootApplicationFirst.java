package com.springboot_001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;



@SpringBootApplication(scanBasePackages="com")
public class SpringBootApplicationFirst extends SpringBootServletInitializer{
	public static void main(String[]args){
        SpringApplication.run(SpringBootApplicationFirst.class, args);
    }

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(SpringBootApplicationFirst.class);
	}
	
}
