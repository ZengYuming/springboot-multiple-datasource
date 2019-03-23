package com.example.springbootmultipledatasource.controller;

import com.example.springbootmultipledatasource.repository.primary.MartinRepository;
import com.example.springbootmultipledatasource.repository.second.TonyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping
@RestController
public class CommonController {
    @Autowired
    MartinRepository martinRepository;
    @Autowired
    TonyRepository tonyRepository;
    @GetMapping
    String index() {
        martinRepository.findById(1L);
        tonyRepository.findById(1L);
        return "";
    }
}