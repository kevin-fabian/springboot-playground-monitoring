package com.fabiankevin.backend.persistence;

import com.fabiankevin.backend.models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class DefaultUserRepository implements UserRepository {
    private final JpaUserRepository jpaUserRepository;
    @Override
    public Optional<User> findByEmail(String email) {
        return jpaUserRepository.findByEmail(email).map(entity -> User.builder()
                .id(entity.getId())
                .name(entity.getName())
                .email(entity.getEmail())
                .build());
    }
}
