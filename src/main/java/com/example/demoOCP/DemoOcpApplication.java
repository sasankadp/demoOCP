package com.example.demoOCP;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoOcpApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoOcpApplication.class, args);
	}

	@PostConstruct
	public void crashOnStepup(){
		throw new RuntimeException("Intentional crash for CrashLoopBackOf");
	}

}
