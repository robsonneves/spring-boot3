package com.br.curso.alura.springboot3.springboot3.controller;

import com.br.curso.alura.springboot3.springboot3.model.login.AutenticationData;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
@AllArgsConstructor
public class AutenticationController {

    private final AuthenticationManager manager;

    @PostMapping
    public ResponseEntity login(@RequestBody @Valid AutenticationData data){
        var token = new UsernamePasswordAuthenticationToken(data.login(), data.password());
        var autentication = manager.authenticate(token);
        return ResponseEntity.ok().build();
    }

}
