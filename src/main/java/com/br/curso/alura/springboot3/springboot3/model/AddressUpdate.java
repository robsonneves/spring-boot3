package com.br.curso.alura.springboot3.springboot3.model;

import jakarta.validation.constraints.Pattern;

public record AddressUpdate(
        String street,
        String neighborhood,
        @Pattern(regexp = "\\d{8}")
        String cep,
        String city,
        String state,
        String complement,
        String number
) {}
