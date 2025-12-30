package com.fabiankevin.backend.web;

import com.fabiankevin.backend.models.User;
import com.fabiankevin.backend.services.UserService;
import io.micrometer.observation.annotation.Observed;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/users")
public class UserController {
    private final UserService userService;

    @GetMapping("/{email}")
    @Observed(name = "/v1/users/{email}",
            contextualName = "RetrieveUserByEmail")
    public UserResponse retrieveUserByEmail(@PathVariable String email) {
        User user = userService.retrieveUserByEmail(email);

        return UserResponse.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .build();
    }
}
