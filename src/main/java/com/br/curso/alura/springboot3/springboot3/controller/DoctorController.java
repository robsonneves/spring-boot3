package com.br.curso.alura.springboot3.springboot3.controller;

import com.br.curso.alura.springboot3.springboot3.mapper.DoctorMapper;
import com.br.curso.alura.springboot3.springboot3.model.Doctor;
import com.br.curso.alura.springboot3.springboot3.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorRepository repository;

    @Autowired
    private DoctorMapper mapper;

    @PostMapping
    public void create(@RequestBody Doctor doctor){
        repository.save(mapper.doctorMapperFromDoctorEntity(doctor));
    }
}
