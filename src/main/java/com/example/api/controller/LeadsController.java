package com.example.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/leads")
public class LeadsController {

    @PostMapping("/create")
    public String createLead() { return "Lead criado!"; }

    @DeleteMapping("/delete")
    public String deleteLead() { return "Lead deletado!"; }
}