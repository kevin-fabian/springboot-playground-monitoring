package com.fabiankevin.springboot_opentelemetry_starter.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/fruits")
public class FruitController {

    @GetMapping
//    @WithSpan(value = "span name")
    public List<String> getFruits(){
        return List.of("Apple", "Grape");
    }
}
