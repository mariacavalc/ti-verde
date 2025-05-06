package com.ecotech.model;

import jakarta.persistence.*;

@Entity
public class ConsumoMensal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mes;
    private int consumo;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getMes() { return mes; }
    public void setMes(String mes) { this.mes = mes; }

    public int getConsumo() { return consumo; }
    public void setConsumo(int consumo) { this.consumo = consumo; }
}