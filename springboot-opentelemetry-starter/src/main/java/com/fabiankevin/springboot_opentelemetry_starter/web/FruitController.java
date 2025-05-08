package com.fabiankevin.springboot_opentelemetry_starter.web;

import com.fabiankevin.springboot_opentelemetry_starter.persistence.FruitEntity;
import com.fabiankevin.springboot_opentelemetry_starter.persistence.FruitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/fruits")
@RequiredArgsConstructor
public class FruitController {
    private final FruitRepository fruitRepository;

    @GetMapping
    public List<FruitEntity> getFruits() {
        return fruitRepository.findAll();
    }
}

