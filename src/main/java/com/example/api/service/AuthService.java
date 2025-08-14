package com.example.api.service;

import com.example.api.model.User;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    private final String USERNAME = "admin";
    private final String PASSWORD = "1234";

    public boolean authenticate(User user) {
        return USERNAME.equals(user.getUsername()) && PASSWORD.equals(user.getPassword());
    }
}