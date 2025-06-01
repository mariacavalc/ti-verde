package com.ecotech.controller;

import com.ecotech.model.ConsumoEquipamento;
import com.ecotech.repository.ConsumoEquipamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/consumo-equipamento")
public class ConsumoEquipamentoController {

    @Autowired
    private ConsumoEquipamentoRepository repository;

    @GetMapping
    public List<ConsumoEquipamento> listar() {
        return repository.findAll();
    }

    @GetMapping("/por-mes-ano")
    public List<ConsumoEquipamento> getConsumoPorMesAno(
            @RequestParam String mes,
            @RequestParam int ano) {
        return repository.findByMesAndAno(mes, ano);
    }

    // Endpoint para adicionar um novo registro de consumo de equipamento
    @PostMapping
    public ConsumoEquipamento adicionarConsumoEquipamento(@RequestBody ConsumoEquipamento consumoEquipamento) {
        return repository.save(consumoEquipamento);
    }

}