package com.example.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/news")
public class NewsController {

    @GetMapping
    public String getNews() { return "Lista de notícias"; }
}