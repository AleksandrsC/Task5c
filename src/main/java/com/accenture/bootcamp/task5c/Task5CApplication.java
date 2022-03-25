package com.accenture.bootcamp.task5c;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Task5CApplication {

	private static final Logger log = LoggerFactory.getLogger(Task5CApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(Task5CApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			IPAddress ipa = restTemplate.getForObject(
					"http://ip.jsontest.com/", IPAddress.class);
			log.info(ipa.toString());
		};
	}

}
