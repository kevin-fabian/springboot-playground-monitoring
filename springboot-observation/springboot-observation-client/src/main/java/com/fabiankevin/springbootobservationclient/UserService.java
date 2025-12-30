package com.fabiankevin.springbootobservationclient;

import io.micrometer.observation.annotation.Observed;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Observed(name = "name",
            contextualName = "getting-user-name")
    public String getUser(String name) {
        return "retrieve user " + name;
    }
}
