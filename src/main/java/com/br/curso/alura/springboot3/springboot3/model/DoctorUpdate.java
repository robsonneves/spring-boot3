package com.br.curso.alura.springboot3.springboot3.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;

public record DoctorUpdate(
    Long id,
    String name,
    @Email
    String email,
    String phone,
    @Pattern(regexp = "\\d{4,6}")
    String crm,
    Specialty specialty,
    AddressUpdate addressUpdate) {}
