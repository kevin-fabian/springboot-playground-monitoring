package com.fabiankevin.springbootprometheuscustommetrics;

import com.fabiankevin.springbootprometheuscustommetrics.services.PlanetService;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public PlanetService planetService(MeterRegistry registry) {
        return new PlanetService(registry);
    }
}
