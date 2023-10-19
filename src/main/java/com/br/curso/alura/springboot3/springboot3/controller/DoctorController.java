package com.br.curso.alura.springboot3.springboot3.controller;

import com.br.curso.alura.springboot3.springboot3.model.Doctor;
import com.br.curso.alura.springboot3.springboot3.service.DoctorService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctors")
@AllArgsConstructor
public class DoctorController {

    private final DoctorService service;

    @PostMapping
    @Transactional
    public void create(@RequestBody @Valid Doctor doctor){
        service.createDoctor(doctor);
    }
}
