package com.random0perator.odontologo.service;

import com.random0perator.odontologo.model.Odontologo;

import java.util.List;

public interface OdontologoService {

    List<Odontologo> listaOdontologos();

    Odontologo crearOdontologo();
    Odontologo buscarOdontologo(Integer id);
    Odontologo modificarOdontologo(Integer id);
    Odontologo eliminarOdontologo(Integer id);

}
