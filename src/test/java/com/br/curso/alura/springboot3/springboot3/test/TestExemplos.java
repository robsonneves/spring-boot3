package com.br.curso.alura.springboot3.springboot3.test;


import com.br.curso.alura.springboot3.springboot3.model.Doctor;
import org.instancio.Instancio;
import org.junit.jupiter.api.Test;

public class TestExemplos {

//    Student student = Instancio.create(Student.class);
//    List<Student> list = Instancio.ofList(Student.class).size(10).create();
//    Stream<Student> stream = Instancio.of(Student.class).stream().limit(10);

    @Test
    void t0(){

        Doctor doctor = Instancio.create(Doctor.class);
        System.out.println(doctor);

    }

}
