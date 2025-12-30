package com.fabiankevin.springbootprometheuscustommetrics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
public class MetricsConfig {
    @Autowired
    private ThreadPoolTaskExecutor taskExecutor;
//
//    @Bean
//    public Gauge<Integer> activeThreadGauge() {
//        return () -> taskExecutor.getActiveCount();
//    }
}
