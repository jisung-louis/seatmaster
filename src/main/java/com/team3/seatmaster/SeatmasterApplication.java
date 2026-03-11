package com.team3.seatmaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SeatmasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeatmasterApplication.class, args);
	}

}
