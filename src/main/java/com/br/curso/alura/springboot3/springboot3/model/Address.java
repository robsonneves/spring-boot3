package com.br.curso.alura.springboot3.springboot3.model;

import com.br.curso.alura.springboot3.springboot3.entity.AddressEntity;
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
) {
    public Address(AddressEntity addressEntity) {
        this(addressEntity.getStreet(), addressEntity.getNeighborhood(), addressEntity.getCep(), addressEntity.getCity(), addressEntity.getState(), addressEntity.getComplement(), addressEntity.getNumber());
    }
}
