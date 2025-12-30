package com.fabiankevin.backend.persistence;

import com.fabiankevin.backend.models.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findByEmail(String email);
}
