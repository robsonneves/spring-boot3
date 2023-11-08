package com.br.curso.alura.springboot3.springboot3.repository;

import com.br.curso.alura.springboot3.springboot3.entity.DoctorEntity;
import com.br.curso.alura.springboot3.springboot3.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    UserDetails findByLogin(String login);
}
