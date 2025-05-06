package com.ecotech.controller;

import com.ecotech.model.ConsumoMensal;
import com.ecotech.repository.ConsumoMensalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/consumo")
public class ConsumoController {
    @Autowired
    private ConsumoMensalRepository repository;

    @GetMapping
    public List<ConsumoMensal> listar() {
        return repository.findAll();
    }
}