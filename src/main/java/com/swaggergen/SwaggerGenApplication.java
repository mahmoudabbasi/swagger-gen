package com.swaggergen;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication(scanBasePackages = "com.openapi.gen.springboot.api")
@SpringBootApplication
public class SwaggerGenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerGenApplication.class, args);
	}

}
