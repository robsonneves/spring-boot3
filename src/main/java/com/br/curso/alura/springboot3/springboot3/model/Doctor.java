package com.br.curso.alura.springboot3.springboot3.model;

import com.br.curso.alura.springboot3.springboot3.entity.DoctorEntity;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record Doctor(
    Long id,
    @NotBlank
    String name,
    @NotBlank
    @Email
    String email,
    @NotBlank
    String phone,
    @NotBlank
    @Pattern(regexp = "\\d{4,6}")
    String crm,
    @NotNull
    Specialty specialty,
    @NotNull
    @Valid
    Address address) {
    public Doctor(DoctorEntity d) {
        this(d.getId(), d.getName(), d.getEmail(), d.getPhone(), d.getCrm(), d.getSpecialty(),
                new Address(d.getAddressEntity()));
    }
}
