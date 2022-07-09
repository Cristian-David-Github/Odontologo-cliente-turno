package com.random0perator.odontologo.service;

import com.random0perator.odontologo.model.Domicilio;
import com.random0perator.odontologo.repositories.DomicilioRepository;
import com.random0perator.odontologo.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DomicilioServiceImpl implements DomicilioService{
    private final DomicilioRepository domicilioRepository;

    @Autowired
    public DomicilioServiceImpl(DomicilioRepository domicilioRepository) {
        this.domicilioRepository = domicilioRepository;
    }


    @Override
    public Domicilio guardarNuevoDomicilio(Domicilio domicilio) {
        return null;
    }

    @Override
    public Optional<Domicilio> buscarDomicilioXid(Integer id) {
        return Optional.empty();
    }

    @Override
    public Domicilio modificarDomicilio(Domicilio Domicilio) {
        return null;
    }

    @Override
    public void eliminarDomicilio(Integer id) {

    }
}
