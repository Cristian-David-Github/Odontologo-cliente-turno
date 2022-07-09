package com.random0perator.odontologo.service;

import com.random0perator.odontologo.model.Odontologo;
import com.random0perator.odontologo.model.Paciente;
import com.random0perator.odontologo.repositories.OdontologoRepository;
import com.random0perator.odontologo.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class  OdontologoServiceImpl implements OdontologoService{

    private final OdontologoRepository odontologoRepository;
    @Autowired
    public OdontologoServiceImpl(OdontologoRepository odontologoRepository) {
        this.odontologoRepository = odontologoRepository;    }

    @Override
    public Odontologo guardarNuevoOdontologo(Odontologo odontologo) {
        return odontologoRepository.save(odontologo);
    }

    @Override
    public Optional<Odontologo> buscarOdontologoXid(Integer id) {
        return odontologoRepository.findById(id);
    }

    @Override
    public List<Odontologo> buscarTodosLosOdontologos() {
        return odontologoRepository.findAll();
    }

    @Override
    public Odontologo modificarOdontologo(Odontologo odontologo) {
        return odontologoRepository.save(odontologo);
    }

    @Override
    public void eliminarOdontologo(Integer id) {
        odontologoRepository.deleteById(id);

    }

}
