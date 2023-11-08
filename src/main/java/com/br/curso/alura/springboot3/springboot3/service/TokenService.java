package com.br.curso.alura.springboot3.springboot3.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.br.curso.alura.springboot3.springboot3.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

@Service
public class TokenService {

    @Value("${api.security.token.secret}")
    private String secret;

    public String createToken(User user) {
        try {
            var algorithm = Algorithm.HMAC256(secret);
            return JWT.create()
                    .withIssuer("API spring-boot3")
                    .withSubject(user.getUsername())
                    .withExpiresAt(dataExpireted())
                    .sign(algorithm);
        } catch (JWTCreationException e){
            throw new RuntimeException("Erro creating token jwt", e);
        }
    }

    private Instant dataExpireted() {
        return LocalDateTime.now().plusHours(1).toInstant(ZoneOffset.of("-03:00"));
    }
}
