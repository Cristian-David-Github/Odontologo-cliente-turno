package com.random0perator.odontologo.service;

import com.random0perator.odontologo.model.Turno;
import com.random0perator.odontologo.repositories.TurnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TurnoServiceImpl implements TurnoService{


    private final TurnoRepository turnoRepository;

    @Autowired
    public TurnoServiceImpl(TurnoRepository turnoRepository){
        this.turnoRepository = turnoRepository;

    }

    @Override
    public Turno registrarTurno(Turno turno) {
        return turnoRepository.save(turno);
    }

    @Override
    public List<Turno> listarTodosLosTurnos() {
        return turnoRepository.findAll();
    }

    @Override
    public void eliminar(Integer id) {
        turnoRepository.deleteById(id);

    }

    @Override
    public Turno actualizar(Turno turno) {
        return turnoRepository.save(turno);
    }

    @Override
    public Optional<Turno> buscar(Integer id) {
        return turnoRepository.findById(id);
    }
}
