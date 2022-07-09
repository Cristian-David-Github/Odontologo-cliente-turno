package com.random0perator.odontologo.service;

import com.random0perator.odontologo.model.Turno;

import java.util.List;
import java.util.Optional;

public interface TurnoService {

    Turno registrarTurno(Turno turno);

    List<Turno> listarTodosLosTurnos();

    void eliminar(Integer id);

    Turno actualizar(Turno turno);

    Optional<Turno> buscar(Integer id);

}
