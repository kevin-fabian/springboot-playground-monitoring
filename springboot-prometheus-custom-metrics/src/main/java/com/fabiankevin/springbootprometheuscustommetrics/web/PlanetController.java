package com.fabiankevin.springbootprometheuscustommetrics.web;

import com.fabiankevin.springbootprometheuscustommetrics.models.Planet;
import com.fabiankevin.springbootprometheuscustommetrics.services.PlanetService;
import io.micrometer.core.instrument.MeterRegistry;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/planets")
@RequiredArgsConstructor
//@Timed
public class PlanetController {
    private final PlanetService planetService;
    private final MeterRegistry meterRegistry;

    @GetMapping

//    @Timed(value = "all.people", longTask = true)
    List<Planet> getPlanets() {
//        Counter counter = Counter.builder("counter_planets_retrieve_all_api_calls")
//                .tag("title", "Retrieve all planets API calls")
//                .description("a number of requests to /v1/planets endpoint")
//                .register(meterRegistry);
//        counter.increment();

        meterRegistry.counter("counter_planets_retrieve_all_api_calls", "title", "Retrieve all planets API calls")
                .increment();

        return planetService.retrievePlanets();
    }
}
