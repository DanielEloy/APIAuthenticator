package com.example.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/profile")
public class ProfileController {

    @PostMapping("/create")
    public String createProfile() { return "Perfil criado!"; }

    @DeleteMapping("/delete")
    public String deleteProfile() { return "Perfil deletado!"; }

    @PutMapping("/update")
    public String updateProfile() { return "Perfil atualizado!"; }
}