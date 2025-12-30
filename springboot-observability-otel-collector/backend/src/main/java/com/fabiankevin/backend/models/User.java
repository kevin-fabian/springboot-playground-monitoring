package com.fabiankevin.backend.models;

import lombok.Builder;
import lombok.Data;
import lombok.Value;

import java.util.UUID;

@Builder(toBuilder = true)
@Value
public class User {
    UUID id;
    String name;
    String email;
}
