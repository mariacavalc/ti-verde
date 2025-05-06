package com.ecotech.controller;

import com.ecotech.model.Dispositivo;
import com.ecotech.repository.DispositivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dispositivos")
public class DispositivoController {
    @Autowired
    private DispositivoRepository repository;

    @GetMapping
    public List<Dispositivo> listar() {
        return repository.findAll();
    }
}