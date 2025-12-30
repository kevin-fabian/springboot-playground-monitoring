package com.fabiankevin.springbootelk;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@RestController
@Slf4j
public class HomeController {

    private List<String> emails = List.of("ari@test.com", "toki.delacruz@gmail.com", "ais.wallenstein@gmail.com");

    private User user = new User("99999999", "test@test.com", "Uhoa");
    ObjectMapper objectMapper = new ObjectMapper();

    @GetMapping("/login")
    public String login() throws JsonProcessingException {
        Random random = new Random();
        int i = random.nextInt(3);
        User user = new User(UUID.randomUUID().toString(), emails.get(i), "hehe");
        log.info("User logged in {}", objectMapper.writeValueAsString(user));
        return "Hello " + user.getEmail();
    }

    @GetMapping("/")
    public String HomePage() {
        LocalDateTime localDateTime = LocalDateTime.now();
//        log.info("Welcome home Page " + localDateTime);
        log.info("Welcome hompage {}", localDateTime);
        log.info("User has logged in {}", user);
        return "Welcome to Home page";
    }

    @GetMapping("/logs")
    public String LogsPage(){
        LocalDateTime localDateTime = LocalDateTime.now();
        log.info("This Logs page " + localDateTime);
        return "Welcome to logs page";
    }

    @GetMapping("/warn")
    public String WarnPage(){
        LocalDateTime localDateTime = LocalDateTime.now();
        log.warn("This warn page " + localDateTime);
        return "Welcome to warn page";
    }


    @GetMapping("/er")
    public String ErrorPage(){
        LocalDateTime localDateTime = LocalDateTime.now();
        log.error("This error page " + localDateTime);
        return "Welcome to error page";
    }


}