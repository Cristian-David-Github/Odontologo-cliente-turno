package com.random0perator.odontologo.repositories;

import com.random0perator.odontologo.model.Turno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnoRepository extends JpaRepository<Turno,Integer> {
}
