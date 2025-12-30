package com.fabiankevin.springbootprometheuscustommetrics.services;

import com.fabiankevin.springbootprometheuscustommetrics.models.Planet;
import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Tag;
import io.micrometer.core.instrument.Timer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

import static java.lang.Thread.sleep;

@Service
public class PlanetService {
    private final MeterRegistry meterRegistry;

    public PlanetService(MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
        Gauge.builder("gauge_planets_count", retrievePlanets()::size)
                .description("A current number of books in the system")
                .register(meterRegistry);
    }

    public List<Planet> retrievePlanets() {
        Tag titleTag = Tag.of("title", "Retrieve planets from the database");
        Timer.Sample timer = Timer.start(meterRegistry);

        Random random = new Random();
        long l = random.nextLong(1000);
        try {
            sleep(l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<Planet> planets = List.of(
                new Planet(1l, "Mercury"),
                new Planet(2l, "Venus"),
                new Planet(3l, "Earth"),
                new Planet(4l, "Mars"),
                new Planet(5l, "Jupiter")
        );
        timer.stop(Timer.builder("timer_planets_service_retrieve_planets")
                .description("Retrieve all planets")
                .tags(List.of(titleTag))
                .register(meterRegistry));
        return planets;
    }
}
