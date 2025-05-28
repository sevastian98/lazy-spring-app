package com.example.today;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {"com.example.today,util"}
)



public class TodayApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodayApplication.class, args);
	}

}
