package com.ecotech.controller;

import com.ecotech.model.ConsumoMensal;
import com.ecotech.repository.ConsumoMensalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/analise-consumo")
public class AnaliseController {

    @Autowired
    private ConsumoMensalRepository repository;

    @GetMapping
    public Map<String, Object> analiseConsumo() {
        List<ConsumoMensal> consumos = repository.findAll();
        Map<String, Object> resultado = new HashMap<>();

        if (consumos.size() < 2) {
            resultado.put("mensagem", "Dados insuficientes para análise");
            return resultado;
        }

        ConsumoMensal atual = consumos.get(consumos.size() - 1);
        ConsumoMensal anterior = consumos.get(consumos.size() - 2);

        int economia = anterior.getConsumo() - atual.getConsumo();
        double percentual = (economia / (double) anterior.getConsumo()) * 100;

        resultado.put("mes", atual.getMes());
        resultado.put("economia", economia);
        resultado.put("percentual", Math.round(percentual));

        return resultado;
    }
}