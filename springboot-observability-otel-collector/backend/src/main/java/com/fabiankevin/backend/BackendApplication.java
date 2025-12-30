package com.fabiankevin.backend;

import com.fabiankevin.backend.persistence.JpaUserRepository;
import com.fabiankevin.backend.persistence.UserEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(JpaUserRepository jpaUserRepository) {
        return args -> {
            UserEntity userEntity = new UserEntity();
            userEntity.setEmail("mayuri@test.com");
            userEntity.setName("Mayuri");
            log.info("Saving {}", userEntity);
            jpaUserRepository.save(userEntity);
        };
    }
}
