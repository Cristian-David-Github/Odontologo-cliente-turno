package com.random0perator.odontologo.service;

import com.random0perator.odontologo.model.Domicilio;



import java.util.Optional;

public interface DomicilioService {

    Domicilio guardarNuevoDomicilio(Domicilio domicilio);
    Optional<Domicilio> buscarDomicilioXid(Integer id);
    Domicilio modificarDomicilio(Domicilio Domicilio);
    void eliminarDomicilio(Integer id);
}
