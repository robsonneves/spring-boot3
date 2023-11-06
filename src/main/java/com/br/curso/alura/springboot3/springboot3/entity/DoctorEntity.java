package com.br.curso.alura.springboot3.springboot3.entity;

import com.br.curso.alura.springboot3.springboot3.model.Doctor;
import com.br.curso.alura.springboot3.springboot3.model.DoctorUpdate;
import com.br.curso.alura.springboot3.springboot3.model.Specialty;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "doctors")
@Entity(name = "Doctor")
@Getter
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
    private AddressEntity addressEntity;

    public DoctorEntity(){}

    public DoctorEntity(Doctor doctor) {
        this.name = doctor.name();
        this.email = doctor.email();
        this.phone = doctor.phone();
        this.crm = doctor.crm();
        this.specialty = doctor.specialty();
        this.addressEntity = new AddressEntity(doctor.address());
    }

    public DoctorEntity(DoctorUpdate doctorUpdate) {
        if(doctorUpdate.name() != null){ this.name = doctorUpdate.name(); }
        if(doctorUpdate.email() != null){ this.email = doctorUpdate.email(); }
        if(doctorUpdate.phone() != null){ this.phone = doctorUpdate.phone(); }
        if(doctorUpdate.crm() != null){ this.crm = doctorUpdate.crm(); }
    }
}

