package com.br.curso.alura.springboot3.springboot3.model.error;

import org.springframework.validation.FieldError;

public record ValidationData(String field, String message) {
    public ValidationData(FieldError error){
        this(error.getField(), error.getDefaultMessage());
    }
}
