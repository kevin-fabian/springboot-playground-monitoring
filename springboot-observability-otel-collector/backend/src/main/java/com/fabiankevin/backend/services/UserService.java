package com.fabiankevin.backend.services;

import com.fabiankevin.backend.models.User;

import java.util.UUID;

public interface UserService {
    User retrieveUser(UUID id);
    User retrieveUserByEmail(String email);
}
