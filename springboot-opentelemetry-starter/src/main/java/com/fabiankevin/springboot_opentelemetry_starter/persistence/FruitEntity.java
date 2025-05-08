package com.fabiankevin.springboot_opentelemetry_starter.persistence;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table
public class FruitEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private Instant createdAt;

    public FruitEntity(String name, Instant createdAt) {
        this.name = name;
        this.createdAt = createdAt;
    }
}
