package com.br.curso.alura.springboot3.springboot3.model;

public record Address(
        String street,
        String neighborhood,
        String cep,
        String city,
        String state,
        String complement,
        String number
) {
}
