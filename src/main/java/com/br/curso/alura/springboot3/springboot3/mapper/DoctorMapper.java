package com.br.curso.alura.springboot3.springboot3.mapper;

import com.br.curso.alura.springboot3.springboot3.entity.AddressEntity;
import com.br.curso.alura.springboot3.springboot3.entity.DoctorEntity;
import com.br.curso.alura.springboot3.springboot3.model.Address;
import com.br.curso.alura.springboot3.springboot3.model.Doctor;

public class DoctorMapper {

    public DoctorEntity doctorMapperFromDoctorEntity(Doctor doctor){

        return DoctorEntity.builder()
                .name(doctor.name())
                .email(doctor.email())
                .crm(doctor.crm())
                .specialty(doctor.specialty())
                .address(addressMapperFromAddressEntity(doctor.address()))
                .build();
    }

    private AddressEntity addressMapperFromAddressEntity(Address address){

        return AddressEntity.builder()
                .street(address.street())
                .neighborhood(address.neighborhood())
                .cep(address.cep())
                .city(address.city())
                .state(address.state())
                .complement(address.complement())
                .number(address.number())
                .build();
    }
}
