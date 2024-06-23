package com.bst.mms.tms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TopicManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TopicManagementServiceApplication.class, args);
		System.out.println("Tomcat Running for Topic Management Service...");

	}
}
