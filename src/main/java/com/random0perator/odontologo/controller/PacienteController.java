package com.random0perator.odontologo.controller;

import com.random0perator.odontologo.model.Paciente;
import com.random0perator.odontologo.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pacientes")

public class PacienteController {
    @Autowired
    private PacienteService pacienteService;

    @GetMapping("/test")
    public Paciente test(){
        Paciente p = new Paciente("cristian","david","cdavid@c.com","2022-09-31");
        System.out.println(pacienteService.guardarNuevoPaciente(p));
        return pacienteService.guardarNuevoPaciente(p);

    }

    @GetMapping("/{id}")
    public Optional<Paciente> buscarPacienteXid(@PathVariable Integer id ){
        return pacienteService.buscarPacienteXid(id);
    }
    @GetMapping("/all")
    public ResponseEntity<?> buscarTodosLosPacientes(){
        return ResponseEntity.ok(pacienteService.buscarTodosLosPacientes());
    }
    @PostMapping()
    public ResponseEntity<?> guardarNuevoPaciente(@RequestBody Paciente p){

        return ResponseEntity.ok(pacienteService.guardarNuevoPaciente(p));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarPaciente(@PathVariable Integer id){
        ResponseEntity<String> response;

        if (pacienteService.buscarPacienteXid(id).isPresent()) {
            pacienteService.eliminarPaciente(id);
            response = ResponseEntity.status(HttpStatus.NO_CONTENT).body("Eliminado");
        } else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return response;
    }

//    Paciente guardarNuevoPaciente(Paciente paciente);
//    Paciente buscarPacienteXemail(String email);
//    List<Paciente> buscarTodosLosPacientes();
//    Paciente modificarPaciente(Paciente paciente);
//    void eliminarPaciente(Integer id);










}
