package com.MyRestTemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MyRestTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyRestTemplateApplication.class, args);
	}
	
	@Bean
	public RestTemplate rest() {
		return new RestTemplate();
	}
}

