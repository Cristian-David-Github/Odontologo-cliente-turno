package com.random0perator.odontologo.service;

import com.random0perator.odontologo.model.Odontologo;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class  OdontologoServiceImpl implements OdontologoService{
    @Override
    public List<Odontologo> listaOdontologos() {
        return Arrays.asList(new Odontologo("Cristian"), new Odontologo("David"));
    }
}
