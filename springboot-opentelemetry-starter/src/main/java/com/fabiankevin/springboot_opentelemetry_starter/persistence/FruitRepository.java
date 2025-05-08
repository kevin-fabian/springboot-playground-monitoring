package com.fabiankevin.springboot_opentelemetry_starter.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FruitRepository extends JpaRepository<FruitEntity, UUID> {
}
