package com.random0perator.odontologo.controller;

import com.random0perator.odontologo.model.Paciente;
import com.random0perator.odontologo.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")

public class PacienteController {
    @Autowired
    private PacienteService pacienteService;

    @GetMapping("/test")
    public Paciente test(){
        Paciente p = new Paciente("cristian","david","cdavid@c.com");
        System.out.println(pacienteService.guardarNuevoPaciente(p));
        return pacienteService.guardarNuevoPaciente(p);

    }

    @GetMapping("/{id}")
    public Paciente buscarPacienteXid(@PathVariable Integer id ){
        return pacienteService.buscarPacienteXid(id);
    }
    @GetMapping("/email/{email}")
    public Paciente buscarPacienteXemail(@PathVariable String email ){
        return pacienteService.buscarPacienteXemail(email);
    }
    @PostMapping()
    public ResponseEntity<?> guardarNuevoPaciente(@RequestBody Paciente p){
        System.out.println(p);
        return ResponseEntity.ok(pacienteService.guardarNuevoPaciente(p));
    }
    @GetMapping("/all")
    public List<Paciente> buscarTodosLosPacientes(){
        return pacienteService.buscarTodosLosPacientes();
    }

//    Paciente guardarNuevoPaciente(Paciente paciente);
//    Paciente buscarPacienteXemail(String email);
//    List<Paciente> buscarTodosLosPacientes();
//    Paciente modificarPaciente(Paciente paciente);
//    void eliminarPaciente(Integer id);










}
