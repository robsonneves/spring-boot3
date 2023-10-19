package com.br.curso.alura.springboot3.springboot3.entity;

import com.br.curso.alura.springboot3.springboot3.model.Specialty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Table(name = "doctors")
@Entity(name = "Doctor")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class DoctorEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String crm;
    @Enumerated(EnumType.STRING)
    private Specialty specialty;
    @Embedded
    private AddressEntity address;
}
