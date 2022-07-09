package com.random0perator.odontologo.service;

import com.random0perator.odontologo.model.Paciente;

import java.util.List;
import java.util.Optional;


public interface PacienteService {

    Paciente guardarNuevoPaciente(Paciente paciente);
    Optional<Paciente> buscarPacienteXid(Integer id);
    List<Paciente> buscarTodosLosPacientes();
    Paciente modificarPaciente(Paciente paciente);
    void eliminarPaciente(Integer id);

}
