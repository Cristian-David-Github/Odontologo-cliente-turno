package com.random0perator.odontologo.service;

import com.random0perator.odontologo.model.Paciente;

import java.util.List;


public interface PacienteService {

    Paciente guardarNuevoPaciente(Paciente paciente);
    Paciente buscarPacienteXid(Integer id);
    Paciente buscarPacienteXemail(String email);
    List<Paciente> buscarTodosLosPacientes();
    Paciente modificarPaciente(Paciente paciente);
    void eliminarPaciente(Integer id);

}
