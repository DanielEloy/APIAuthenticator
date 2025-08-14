package com.example.api.controller;

import com.example.api.model.User;
import com.example.api.security.JwtUtil;
import com.example.api.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        if (authService.authenticate(user)) {
            return JwtUtil.generateToken(user.getUsername());
        }
        return "Usuário ou senha inválidos!";
    }
}