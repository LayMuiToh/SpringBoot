package com.frankmoley;

import com.frankmoley.landon.data.entity.Alien;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ReservationsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ReservationsApplication.class, args);
		System.out.println("Welcome to Spring Boot...");

		Alien a = context.getBean(Alien.class);
		a.show();

		Alien a1 = context.getBean(Alien.class);
		a1.show();
	}
}
