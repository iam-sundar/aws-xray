package com.st.xray.schoolapi;

import com.amazonaws.xray.javax.servlet.AWSXRayServletFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

@SpringBootApplication
public class SchoolApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolApiApplication.class, args);
	}

	@Bean
	public Filter TracingFilter(){
		return new AWSXRayServletFilter("SchoolApi");
	}

}
