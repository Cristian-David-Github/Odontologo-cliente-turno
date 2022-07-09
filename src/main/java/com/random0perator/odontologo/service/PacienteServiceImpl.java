package com.random0perator.odontologo.service;

import com.random0perator.odontologo.model.Paciente;
import com.random0perator.odontologo.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public Paciente buscarPacienteXid(Integer id) {
        return pacienteRepository.getPacienteById(id);
    }

    @Override
    public Paciente buscarPacienteXemail(String email) {
        return pacienteRepository.getPacienteByEmail(email);
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
