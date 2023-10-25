package com.br.curso.alura.springboot3.springboot3.controller;

import com.br.curso.alura.springboot3.springboot3.model.Doctor;
import com.br.curso.alura.springboot3.springboot3.service.DoctorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorService service;

    @PostMapping
    @Transactional
    public void create(@RequestBody @Valid Doctor doctor){
        service.createDoctor(doctor);
    }

    @GetMapping
    @Transactional
    public List<Doctor> findAll(){ return service.findAll(); }

    @GetMapping("/{id}")
    @Transactional
    public Doctor findById(@PathVariable("id") Long id){
        return  service.findById(id); }

    @GetMapping("/doctor")
    @Transactional
    public Doctor findByNameOrCrm(@RequestHeader("name") String name, @RequestHeader("crm") String crm){
        return service.findByNameOrCrm(name, crm);
    }
}
