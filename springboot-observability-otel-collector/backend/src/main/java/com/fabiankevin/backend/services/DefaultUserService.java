package com.fabiankevin.backend.services;

import com.fabiankevin.backend.models.User;
import com.fabiankevin.backend.persistence.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class DefaultUserService implements UserService {
    private final UserRepository userRepository;
    @Override
    public User retrieveUser(UUID id) {
        return null;
    }

    @Override
    public User retrieveUserByEmail(String email) {
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("User with email="+email+" hasn't found."));
    }
}
