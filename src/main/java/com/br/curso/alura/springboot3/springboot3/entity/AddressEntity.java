package com.br.curso.alura.springboot3.springboot3.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Embeddable
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddressEntity {

    private String street;
    private String neighborhood;
    private String cep;
    private String city;
    private String state;
    private String complement;
    private String number;
}
