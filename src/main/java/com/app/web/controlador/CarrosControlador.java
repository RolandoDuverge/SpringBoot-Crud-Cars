package com.app.web.controlador;


import com.app.web.servicio.CarrosServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.app.web.entidad.Carros;


@Controller
public class CarrosControlador {

    @Autowired
    private CarrosServicio servicio;

        @GetMapping({ "/carros", "/" })
        public String listarCarros(Model modelo, @Param("palabraClave") String palabraClave) {
            modelo.addAttribute("carros", servicio.listarTodosLosCarros(palabraClave));
            modelo.addAttribute("palabraClave", palabraClave);
            return "carros";
        }

        @GetMapping("/carros/nuevo")
        public String registrarCarro(Model modelo) {
            Carros carro = new Carros();
            modelo.addAttribute("carro", carro);
            return "crear_carro";
        }
        @PostMapping("/carros")
        public String guardarCarro(@ModelAttribute("Carro") Carros Carro) {
            servicio.guardarCarro(Carro);
            return "redirect:/carros";
        }
        @GetMapping("/carros/editar/{id}")
        public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo) {
            modelo.addAttribute("carro", servicio.obtenerCarroId(id));
            return "editar_carro";
        }

        @PostMapping("/carros/{id}")
        public String actualizarCarro(@PathVariable Long id, @ModelAttribute("carro") Carros Carro,Model modelo) {
            Carros carrosExistente = servicio.obtenerCarroId(id);
            carrosExistente.setId(id);
            carrosExistente.setModelo(Carro.getModelo());
            carrosExistente.setMarca(Carro.getMarca());
            carrosExistente.setDescripcion(Carro.getDescripcion());
            carrosExistente.setNumero_de_Chasis(Carro.getNumero_de_Chasis());
            carrosExistente.setNumero_de_Placa(Carro.getNumero_de_Placa());
            carrosExistente.setTipo_Combustible(Carro.getTipo_Combustible());
            carrosExistente.setTipo_de_vehiculo(Carro.getTipo_de_vehiculo());

            servicio.actualizarCarro(carrosExistente);
            return "redirect:/carros";
        }

        @GetMapping("/carros/{id}")
        public String eliminarCarro(@PathVariable Long id) {
            servicio.eliminarCarro(id);
            return "redirect:/carros";
        }
}

