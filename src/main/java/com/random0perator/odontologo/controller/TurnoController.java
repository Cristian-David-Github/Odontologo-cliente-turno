package com.random0perator.odontologo.controller;

import com.random0perator.odontologo.model.Turno;
import com.random0perator.odontologo.service.OdontologoService;
import com.random0perator.odontologo.service.PacienteService;
import com.random0perator.odontologo.service.TurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("turnos")
public class TurnoController {

    @Autowired
    private TurnoService turnoService;
    @Autowired
    private PacienteService pacienteService;
    @Autowired
    private OdontologoService odontologoService;

    @PostMapping
    public ResponseEntity<Turno> registrarTurno(@RequestBody Turno turno){
        ResponseEntity<Turno> response;
        if (pacienteService.buscarPacienteXid(turno.getPaciente().getId()).isPresent() && odontologoService.buscarOdontologoXid(turno.getOdontologo().getId()).isPresent())
            response = ResponseEntity.ok(turnoService.registrarTurno(turno));

        else
            response = ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

        return response;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Turno>> listar() {
        return ResponseEntity.ok(turnoService.listarTodosLosTurnos());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar(@PathVariable Integer id) {
        ResponseEntity<String> response;
        if (turnoService.buscar(id).isPresent()) {
            turnoService.eliminar(id);
            response = ResponseEntity.status(HttpStatus.NO_CONTENT).body("Turno eliminado");
        } else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return response;
    }

    @PutMapping
    public ResponseEntity<Turno> actualizarTurno(@RequestBody Turno turno) {
        return ResponseEntity.ok(turnoService.actualizar(turno));

    }
}
