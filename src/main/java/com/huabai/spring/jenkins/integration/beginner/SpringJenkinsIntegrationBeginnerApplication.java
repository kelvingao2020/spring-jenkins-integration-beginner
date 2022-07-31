package com.huabai.spring.jenkins.integration.beginner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsIntegrationBeginnerApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsIntegrationBeginnerApplication.class);

	@PostConstruct
	public void init(){
		logger.info("Inside init() SpringJenkinsIntegrationBeginner class --Application started...");
	}

	public static void main(String[] args) {

		logger.info("Inside main() of SpringJenkinsIntegrationBeginner class --Application executed...");
		SpringApplication.run(SpringJenkinsIntegrationBeginnerApplication.class, args);
	}

}
