package com.random0perator.odontologo.repositories;

import com.random0perator.odontologo.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer> {
    Paciente getPacienteByEmail(String email);
    Boolean existsByEmail(String email);
   Paciente getPacienteById(Integer id);
}
