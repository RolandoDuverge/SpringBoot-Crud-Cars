package com.app.web.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.web.entidad.Carros;

@Repository
public interface CarrosRepositorio extends JpaRepository<Carros, Long> {

}
