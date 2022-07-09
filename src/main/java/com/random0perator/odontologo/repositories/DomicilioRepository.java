package com.random0perator.odontologo.repositories;

import com.random0perator.odontologo.model.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomicilioRepository extends JpaRepository<Domicilio, Integer> {
}
