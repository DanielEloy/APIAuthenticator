package com.example.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sales")
public class SalesController {

    @GetMapping("/highlights")
    public String highlights() { return "Destaques de vendas"; }

    @GetMapping("/month")
    public String month() { return "Vendas do mês"; }

    @GetMapping("/stars")
    public String stars() { return "Vendedores estrela"; }

    @GetMapping("/year")
    public String year() { return "Vendas do ano"; }
}