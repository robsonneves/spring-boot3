package com.br.curso.alura.springboot3.springboot3.service;

import com.br.curso.alura.springboot3.springboot3.entity.DoctorEntity;
import com.br.curso.alura.springboot3.springboot3.model.Doctor;
import com.br.curso.alura.springboot3.springboot3.model.DoctorUpdate;
import com.br.curso.alura.springboot3.springboot3.repository.DoctorRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DoctorService {

    private DoctorRepository repository;
    public DoctorService(DoctorRepository repository) {
        this.repository = repository;
    }

    public DoctorEntity createDoctor(Doctor doctor){
        var d = new DoctorEntity(doctor);
        repository.save(d);
        return d;
    }

    public List<Doctor> findAll() {
        return repository.findAll().stream().map(Doctor::new).collect(Collectors.toList());
    }

    public Doctor findById(Long id) {
        return repository.findById(id).map(Doctor::new).get();
    }

    public Doctor findByNameOrCrm(String name, String crm) {
        return repository.findByNameOrCrm(name, crm).map(Doctor::new).get();
    }

    public Doctor update(DoctorUpdate doctorUpdate) {
        var doctor = repository.findById(doctorUpdate.id()).map(Doctor::new).get();
        var d = new DoctorEntity(doctorUpdate);
        return doctor;
    }

    public ResponseEntity delete(Long id) {
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}