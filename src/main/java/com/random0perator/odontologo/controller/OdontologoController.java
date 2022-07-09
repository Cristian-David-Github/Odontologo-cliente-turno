package com.random0perator.odontologo.controller;

import com.random0perator.odontologo.model.Odontologo;
import com.random0perator.odontologo.service.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("odontologos")
public class OdontologoController {
    
    private final OdontologoService odontologoService;
    
    @Autowired
    public OdontologoController(OdontologoService odontologoService){
        this.odontologoService = odontologoService;
    }

    @GetMapping("/todos")
    public List<Odontologo> getOdontologos(){
        return odontologoService.listaOdontologos();
    }
    @GetMapping("/{id}")
    public Odontologo getOdontologoXid(@PathVariable Integer id){
        return odontologoService.buscarOdontologo(id);
    }
}
