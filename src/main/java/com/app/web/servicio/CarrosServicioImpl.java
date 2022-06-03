package com.app.web.servicio;

import com.app.web.entidad.Carros;
import com.app.web.repositorio.CarrosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarrosServicioImpl implements CarrosServicio{

    @Autowired
    private CarrosRepositorio repositorio;

    @Override
    public List<Carros> listarTodosLosCarros() {
        return repositorio.findAll();
    }

    @Override
    public Carros guardarCarro(Carros Carro) {
        return repositorio.save(Carro);
    }
}
