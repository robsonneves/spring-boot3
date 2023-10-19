package com.br.curso.alura.springboot3.springboot3.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record Address(
        @NotBlank
        String street,
        @NotBlank
        String neighborhood,
        @NotBlank
        @Pattern(regexp = "\\d{8}")
        String cep,
        @NotBlank
        String city,
        @NotBlank
        String state,
        String complement,
        String number
) {}
