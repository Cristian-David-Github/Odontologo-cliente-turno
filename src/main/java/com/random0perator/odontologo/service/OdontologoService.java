package com.random0perator.odontologo.service;

import com.random0perator.odontologo.model.Odontologo;
import com.random0perator.odontologo.model.Paciente;

import java.util.List;
import java.util.Optional;

public interface OdontologoService {


    Odontologo guardarNuevoOdontologo(Odontologo odontologo);
    Optional<Odontologo> buscarOdontologoXid(Integer id);
    List<Odontologo> buscarTodosLosOdontologos();
    Odontologo modificarOdontologo(Odontologo Odontologo);
    void eliminarOdontologo(Integer id);


}
