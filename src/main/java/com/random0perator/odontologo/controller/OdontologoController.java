package com.random0perator.odontologo.controller;

import com.random0perator.odontologo.model.Odontologo;
import com.random0perator.odontologo.model.Paciente;
import com.random0perator.odontologo.service.OdontologoService;
import com.random0perator.odontologo.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("odontologos")
public class OdontologoController {
    
    private final OdontologoService odontologoService;
    
    @Autowired
    public OdontologoController(OdontologoService odontologoService){
        this.odontologoService = odontologoService;
    }

    @GetMapping("/test")
    public Odontologo test(){
        Odontologo o = new Odontologo("Cristian","David",2);
        System.out.println(odontologoService.guardarNuevoOdontologo(o));
        return odontologoService.guardarNuevoOdontologo(o);

    }

    @GetMapping("/{id}")
    public Optional<Odontologo> buscarOdontologoXid(@PathVariable Integer id ){
        return odontologoService.buscarOdontologoXid(id);
    }
    @GetMapping("/all")
    public ResponseEntity<?> buscarTodosLosOdontologos(){
        return ResponseEntity.ok(odontologoService.buscarTodosLosOdontologos());
    }
    @PostMapping()
    public ResponseEntity<?> guardarNuevoOdontologo(@RequestBody Odontologo o){

        return ResponseEntity.ok(odontologoService.guardarNuevoOdontologo(o));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarOdontologo(@PathVariable Integer id){
        ResponseEntity<String> response;

        if (odontologoService.buscarOdontologoXid(id).isPresent()) {
            odontologoService.eliminarOdontologo(id);
            response = ResponseEntity.status(HttpStatus.NO_CONTENT).body("Eliminado");
        } else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return response;
    }


}
