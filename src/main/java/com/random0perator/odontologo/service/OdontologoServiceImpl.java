package com.random0perator.odontologo.service;

import com.random0perator.odontologo.model.Odontologo;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class  OdontologoServiceImpl implements OdontologoService{


    @Override
    public Odontologo buscarOdontologo(Integer id) {
        List<Odontologo> odontologos = listaOdontologos();
        return odontologos.get(id);


    }

    @Override
    public Odontologo modificarOdontologo(Integer id) {
        return null;
    }

    @Override
    public Odontologo eliminarOdontologo(Integer id) {
        return null;
    }

    @Override
    public List<Odontologo> listaOdontologos() {
        return null;
    }

    @Override
    public Odontologo crearOdontologo() {
        return null;
    }
}
