package com.br.curso.alura.springboot3.springboot3.controller;

import com.br.curso.alura.springboot3.springboot3.model.Doctor;
import com.br.curso.alura.springboot3.springboot3.model.DoctorUpdate;
import com.br.curso.alura.springboot3.springboot3.service.DoctorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorService service;

    @PostMapping
    @Transactional
    public ResponseEntity create(@RequestBody @Valid Doctor doctor, UriComponentsBuilder uriBuilder){
        var doctorEntity = service.createDoctor(doctor);
        var uri = uriBuilder.path("/doctors/{id}").buildAndExpand(new Doctor(doctorEntity)).toUri();
        return ResponseEntity.created(uri).body(new Doctor(doctorEntity));
    }

    @GetMapping
    public ResponseEntity<List<Doctor>> findAll(){
        var doctors = service.findAll();
        return ResponseEntity.ok(doctors);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Doctor> findById(@PathVariable("id") Long id){
        var doctor = service.findById(id);
        return ResponseEntity.ok(doctor);
    }

    @GetMapping("/doctor")
    public ResponseEntity<Doctor> findByNameOrCrm(@RequestHeader("name") String name, @RequestHeader("crm") String crm){
        var doctor = service.findByNameOrCrm(name, crm);
        return ResponseEntity.ok(doctor);
    }

    @PutMapping
    @Transactional
    public ResponseEntity create(@RequestBody @Valid DoctorUpdate doctorUpdate){
        var doctor = service.update(doctorUpdate);
        return ResponseEntity.ok(doctor);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity delete(@PathVariable("id") Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
