package com.random0perator.odontologo.service;

import com.random0perator.odontologo.model.Paciente;
import com.random0perator.odontologo.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteServiceImpl implements PacienteService {


    private final PacienteRepository pacienteRepository;

    @Autowired
    public PacienteServiceImpl(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    @Override
    public Paciente guardarNuevoPaciente(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    @Override
    public Optional<Paciente> buscarPacienteXid(Integer id) {
        return pacienteRepository.findById(id);
    }

    @Override
    public List<Paciente> buscarTodosLosPacientes() {
        return pacienteRepository.findAll();
    }
    @Override
    public Paciente modificarPaciente(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }
    @Override
    public void eliminarPaciente(Integer id) {
        pacienteRepository.deleteById(id);

    }
}
