package com.br.curso.alura.springboot3.springboot3.service;

import com.br.curso.alura.springboot3.springboot3.mapper.DoctorMapper;
import com.br.curso.alura.springboot3.springboot3.model.Doctor;
import com.br.curso.alura.springboot3.springboot3.repository.DoctorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DoctorService {

    private final DoctorRepository repository;
    private final DoctorMapper mapper;

    public void createDoctor(Doctor doctor){
        repository.save(mapper.doctorMapperFromDoctorEntity(doctor));
    }
}
