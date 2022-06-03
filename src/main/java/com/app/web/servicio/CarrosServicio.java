package com.app.web.servicio;

import java.util.List;
import com.app.web.entidad.Carros;

public interface CarrosServicio {

    public List<Carros> listarTodosLosCarros();

    public Carros guardarCarro(Carros Carro);
}
