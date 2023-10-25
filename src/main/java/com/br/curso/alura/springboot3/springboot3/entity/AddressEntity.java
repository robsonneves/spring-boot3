package com.br.curso.alura.springboot3.springboot3.entity;

import com.br.curso.alura.springboot3.springboot3.model.Address;
import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter
public class AddressEntity {

    private String street;
    private String neighborhood;
    private String cep;
    private String city;
    private String state;
    private String complement;
    private String number;

    public AddressEntity() {}

    public AddressEntity(Address address) {
        this.street = address.street();
        this.neighborhood = address.neighborhood();
        this.cep = address.cep();
        this.city = address.city();
        this.state = address.state();
        this.complement = address.complement();
        this.number = address.number();
    }
}
