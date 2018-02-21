package com.decapitator.guruspringappone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.decapitator.guruspringappone.model"})
public class GuruspringapponeApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuruspringapponeApplication.class, args);
	}
}
