package com.br.curso.alura.springboot3.springboot3.repository;

import com.br.curso.alura.springboot3.springboot3.entity.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<DoctorEntity, Long> {}
