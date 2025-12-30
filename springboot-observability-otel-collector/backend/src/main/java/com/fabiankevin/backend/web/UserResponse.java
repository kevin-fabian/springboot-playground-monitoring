package com.fabiankevin.backend.web;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Builder(toBuilder = true)
@Value
public class UserResponse {
    UUID id;
    String name;
    String email;
}
