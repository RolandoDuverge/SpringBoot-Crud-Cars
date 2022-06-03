package com.app.web;

import com.app.web.entidad.Carros;
import com.app.web.repositorio.CarrosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class  CrudSpringBootApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CrudSpringBootApplication.class, args);
    }

    @Autowired
    private CarrosRepositorio repositorio;

    @Override
    public void run(String... args) throws Exception {
        Carros Carros1 = new Carros("Kia", "Picanto", "Nuevo", "Gasolina", "2020", "A213213213", "2321323", "Sport");
        repositorio.save(Carros1);

        Carros Carros2 = new Carros("Toyota", "Corolla", "Nuevo", "Gasolina", "2020", "A2132213213", "23212323", "Sport");
        repositorio.save(Carros2);
    }
}
