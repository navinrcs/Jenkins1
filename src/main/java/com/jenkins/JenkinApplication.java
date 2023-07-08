package com.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinApplication {
	
	public static Logger logger = LoggerFactory.getLogger(JenkinApplication.class);
	
	
	
	@PostConstruct
	public void intt() {
		
		logger.info("application started...");
	}
	

	public static void main(String[] args) {
		
		logger.info("Application executed....");
		SpringApplication.run(JenkinApplication.class, args);
	}

}
