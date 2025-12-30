package com.fabiankevin.springboot_observation_tempo;

import io.micrometer.observation.Observation;
import io.micrometer.observation.ObservationRegistry;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class SampleController {
    private final ObservationRegistry observationRegistry;

    @GetMapping("/hello")
    public String hello() {
        Observation observation = Observation.createNotStarted("sample.observation", observationRegistry);
        observation.start();
        log.info("Received /hello request");
        try (Observation.Scope scope = observation.openScope()) {
            // Simulate some work
            Thread.sleep(100);
            return "Hello, World!";
        } catch (InterruptedException e) {
            observation.error(e);
            return "Error!";
        } finally {
            observation.stop();
        }
    }

    @GetMapping("/greet")
    public String greet(){
        log.info("Greetings!cl");
        return "Konichiwa";
    }
}
