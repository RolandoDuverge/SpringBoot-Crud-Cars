package com.app.web.controlador;


import com.app.web.servicio.CarrosServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;


@Controller
public class CarrosControlador {

    @Autowired
    private CarrosServicio servicio;

    @GetMapping({"/carros", "/"})
    public String listarCarros(Model modelo){
        modelo.addAttribute("carros", servicio.listarTodosLosCarros());
        return "carros";
    }
}
