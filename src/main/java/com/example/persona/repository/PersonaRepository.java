package com.example.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.persona.model.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository  extends JpaRepository<Persona, Integer>{

}
