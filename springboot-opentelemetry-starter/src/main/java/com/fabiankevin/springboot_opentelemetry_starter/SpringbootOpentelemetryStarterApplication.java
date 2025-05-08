package com.fabiankevin.springboot_opentelemetry_starter;

import com.fabiankevin.springboot_opentelemetry_starter.persistence.FruitEntity;
import com.fabiankevin.springboot_opentelemetry_starter.persistence.FruitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.Instant;

@SpringBootApplication
public class SpringbootOpentelemetryStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootOpentelemetryStarterApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(FruitRepository fruitRepository) {
		return args -> {
			Instant now = Instant.now();
			fruitRepository.save(new FruitEntity("Apple", now));
			fruitRepository.save(new FruitEntity("Grape", now));
		};
	}

}
