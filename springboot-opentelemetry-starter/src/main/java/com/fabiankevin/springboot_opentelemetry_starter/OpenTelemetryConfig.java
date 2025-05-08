package com.fabiankevin.springboot_opentelemetry_starter;

//@Configuration
//public class OpenTelemetryConfig {
//
//    @Bean
//    public OpenTelemetry openTelemetry() {
//        SdkTracerProvider tracerProvider = SdkTracerProvider.builder()
//                .setSampler(Sampler.traceIdRatioBased(1))
//                // Sample 10% of traces
//                .build();
//
//        return OpenTelemetrySdk.builder()
//                .setTracerProvider(tracerProvider)
//                .build();
//    }
//}