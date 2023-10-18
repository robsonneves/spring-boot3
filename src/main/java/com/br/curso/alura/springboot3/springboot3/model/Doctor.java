package com.br.curso.alura.springboot3.springboot3.model;

public record Doctor(
        String name,
        String email,
        String crm,
        Specialty specialty,
        Address address) {}
